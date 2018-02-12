#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.common.result;

import ${package}.client.common.error.ErrorInfo;
import lombok.Data;

/**
 * Created by ${userName} on ${today}.
 */
@Data
public class Result<Value> {
    private boolean success;
    private Value data;
    private ErrorInfo error;

    Result(boolean success) {
        this(success, null, null);
    }

    Result(boolean success, Value data) {
        this(success, data, null);
    }

    Result(boolean success, Value data, ErrorInfo error) {
        this.success = success;
        this.data = data;
        this.error = error;
    }

    public boolean hasValue() {
        return success && notNull();
    }

    public boolean notNull() {
        return data != null;
    }

}
