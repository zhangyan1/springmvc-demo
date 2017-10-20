#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal.user.mapper;

import ${package}.client.user.domain.UserInfoDomain;
import ${package}.client.user.query.UserInfoQuery;
import ${package}.dal.common.mapper.DomainMapper;

/**
 * Created by ${userName} on ${today}.
 */
public interface UserInfoMapper extends DomainMapper<UserInfoDomain, UserInfoQuery> {
}
