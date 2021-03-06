
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for V1UpdateEmployeeRoleRequest type.
 */
public class V1UpdateEmployeeRoleRequest {
    private final V1EmployeeRole body;

    /**
     * Initialization constructor.
     * @param body V1EmployeeRole value for body.
     */
    @JsonCreator
    public V1UpdateEmployeeRoleRequest(
            @JsonProperty("body") V1EmployeeRole body) {
        this.body = body;
    }

    /**
     * Getter for Body.
     * V1EmployeeRole
     * @return Returns the V1EmployeeRole
     */
    @JsonGetter("body")
    public V1EmployeeRole getBody() {
        return this.body;
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1UpdateEmployeeRoleRequest)) {
            return false;
        }
        V1UpdateEmployeeRoleRequest other = (V1UpdateEmployeeRoleRequest) obj;
        return Objects.equals(body, other.body);
    }

    /**
     * Converts this V1UpdateEmployeeRoleRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V1UpdateEmployeeRoleRequest [" + "body=" + body + "]";
    }

    /**
     * Builds a new {@link V1UpdateEmployeeRoleRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1UpdateEmployeeRoleRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body);
        return builder;
    }

    /**
     * Class to build instances of {@link V1UpdateEmployeeRoleRequest}.
     */
    public static class Builder {
        private V1EmployeeRole body;

        /**
         * Initialization constructor.
         * @param body V1EmployeeRole value for body.
         */
        public Builder(V1EmployeeRole body) {
            this.body = body;
        }

        /**
         * Setter for body.
         * @param body V1EmployeeRole value for body.
         * @return Builder
         */
        public Builder body(V1EmployeeRole body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link V1UpdateEmployeeRoleRequest} object using the set fields.
         * @return {@link V1UpdateEmployeeRoleRequest}
         */
        public V1UpdateEmployeeRoleRequest build() {
            return new V1UpdateEmployeeRoleRequest(body);
        }
    }
}
