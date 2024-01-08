package com.travelroute.infrastructure.repository.user;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.travelroute.domain.repository.user.UserQuery;
import com.travelroute.infrastructure.entity.user.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Objects;

import static com.travelroute.infrastructure.entity.user.QUserEntity.userEntity;


public class UserQueryDslRepositoryImpl implements UserQueryDslRepository {

    private final JPAQueryFactory queryFactory;

    public UserQueryDslRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.queryFactory = jpaQueryFactory;
    }

    @Override
    public Page<UserEntity> findAll(UserQuery.FindAllQuery query, Pageable pageable) {

        BooleanBuilder whereBuilder = getFindAllWhereBuilder(query);

        List<UserEntity> contents = queryFactory
            .select(userEntity)
            .from(userEntity.userEntity)
            .where(whereBuilder)
            .offset(pageable.getOffset())
            .limit(pageable.getPageSize())
            .fetch();

        Long count = queryFactory
            .select(userEntity.userEntity.count())
            .from(userEntity.userEntity)
            .where(whereBuilder)
            .fetchOne();

        return new PageImpl<>(contents, pageable, Objects.isNull(count) ? 0 : count);
    }

    private BooleanBuilder getFindAllWhereBuilder(UserQuery.FindAllQuery query) {
        BooleanBuilder builder = new BooleanBuilder();

        if (query.name() != null) {
            builder.and(userEntity.name.eq(query.name()));
        }

        return builder;
    }
}
