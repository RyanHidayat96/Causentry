package com.bpjstku.data.asik.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/asik/model/response/EmployeeResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "p0", "<init>", "(Lcom/bpjstku/data/asik/model/response/EmployeeItem;)V", "component1", "()Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "copy", "(Lcom/bpjstku/data/asik/model/response/EmployeeItem;)Lcom/bpjstku/data/asik/model/response/EmployeeResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "employee", "Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "getEmployee"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmployeeResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("employee")
    private final EmployeeItem employee;

    public final EmployeeItem getEmployee() {
        return this.employee;
    }

    public EmployeeResponse(EmployeeItem employeeItem) {
        this.employee = employeeItem;
    }

    public static /* synthetic */ EmployeeResponse copy$default(EmployeeResponse employeeResponse, EmployeeItem employeeItem, int i, Object obj) {
        if ((i & 1) != 0) {
            employeeItem = employeeResponse.employee;
        }
        return employeeResponse.copy(employeeItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EmployeeItem getEmployee() {
        return this.employee;
    }

    public final EmployeeResponse copy(EmployeeItem p0) {
        return new EmployeeResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof EmployeeResponse) && Intrinsics.areEqual(this.employee, ((EmployeeResponse) p0).employee);
    }

    public final int hashCode() {
        EmployeeItem employeeItem = this.employee;
        if (employeeItem == null) {
            return 0;
        }
        return employeeItem.hashCode();
    }

    public final String toString() {
        EmployeeItem employeeItem = this.employee;
        StringBuilder sb = new StringBuilder("EmployeeResponse(employee=");
        sb.append(employeeItem);
        sb.append(")");
        return sb.toString();
    }
}
