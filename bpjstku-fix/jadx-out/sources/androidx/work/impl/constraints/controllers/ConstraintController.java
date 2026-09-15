package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.model.WorkSpec;
import defpackage.clampVideoBitrateIfNotSupported;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController;", "", "Landroidx/work/impl/model/WorkSpec;", "p0", "", "hasConstraint", "(Landroidx/work/impl/model/WorkSpec;)Z", "isCurrentlyConstrained", "Landroidx/work/Constraints;", "LclampVideoBitrateIfNotSupported;", "Landroidx/work/impl/constraints/ConstraintsState;", "track", "(Landroidx/work/Constraints;)LclampVideoBitrateIfNotSupported;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ConstraintController {
    boolean hasConstraint(WorkSpec p0);

    boolean isCurrentlyConstrained(WorkSpec p0);

    clampVideoBitrateIfNotSupported<ConstraintsState> track(Constraints p0);
}
