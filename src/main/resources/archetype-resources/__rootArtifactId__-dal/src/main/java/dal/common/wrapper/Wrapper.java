#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal.common.wrapper;

import ${package}.client.common.domain.Domain;
import ${package}.client.common.error.ErrorWrapper;
import ${package}.client.common.list.ListWrapper;
import ${package}.client.common.query.Query;
import ${package}.client.common.result.Result;
import ${package}.dal.common.mapper.Mapper;

import java.util.List;

/**
 * Created by ${userName} on ${today}.
 */
public abstract class Wrapper<D extends Domain, Q extends Query> {
    protected abstract Mapper<D, Q> getMapper();

    public Result<Long> count(Q query) {
        return MapperWrapper.count(getMapper(), query);
    }

    public Result<Long> count(Q query, ErrorWrapper error) {
        return MapperWrapper.count(getMapper(), query, error);
    }

    public Result<ListWrapper<M>> find(Q query) {
        return MapperWrapper.find(getMapper(), query);
    }

    public Result<ListWrapper<M>> find(Q query, ErrorWrapper error) {
        return MapperWrapper.find(getMapper(), query, error);
    }

    public Result<M> get(Q query) {
        return MapperWrapper.get(getMapper(), query);
    }

    public Result<M> get(Q query, ErrorWrapper error) {
        return MapperWrapper.get(getMapper(), query, error);
    }

    public Result<E> insert(D domain) {
        return MapperWrapper.insert(getMapper(), domain);
    }

    public Result<E> insert(D domain, ErrorWrapper error) {
        return MapperWrapper.insert(getMapper(), domain, error);
    }

    public Result<Long> batchInsert(List<D> domains) {
        return MapperWrapper.batchInsert(getMapper(), domains);
    }

    public Result<Long> batchInsert(List<D> domains, ErrorWrapper error) {
        return MapperWrapper.batchInsert(getMapper(), domains, error);
    }

    public Result<E> update(D domain) {
        return MapperWrapper.update(getMapper(), domain);
    }

    public Result<E> update(D domain, ErrorWrapper error) {
        return MapperWrapper.update(getMapper(), domain, error);
    }

    public Result<E> delete(D domain) {
        return MapperWrapper.delete(getMapper(), domain);
    }

    public Result<E> delete(D domain, ErrorWrapper error) {
        return MapperWrapper.delete(getMapper(), domain, error);
    }

    public Result<Void> create(String tableName) {
        return MapperWrapper.create(getMapper(), tableName);
    }

    public Result<Void> create(String tableName, ErrorWrapper error) {
        return MapperWrapper.create(getMapper(), tableName, error);
    }
}