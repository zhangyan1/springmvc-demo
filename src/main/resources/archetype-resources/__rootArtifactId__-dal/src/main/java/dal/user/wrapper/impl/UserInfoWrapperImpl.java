#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal.user.wrapper.impl;

import ${package}.client.common.error.ErrorInfo;
import ${package}.client.common.exception.DatabaseSqlExecuteException;
import ${package}.client.common.list.ListWrapper;
import ${package}.client.common.result.Result;
import ${package}.client.common.result.ResultFactory;
import ${package}.client.user.domain.UserInfoDomain;
import ${package}.client.user.query.UserInfoQuery;
import ${package}.dal.common.wrapper.MapperWrapper;
import ${package}.dal.user.mapper.UserInfoMapper;
import ${package}.dal.user.wrapper.UserInfoWrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * Created by ${userName} on ${today}.
 */
@Service("userInfoWrapper")
public class UserInfoWrapperImpl implements UserInfoWrapper {
   
}
