package retrofit2.adapter.rxjava2;

import defpackage.VideoRecordEventStart;
import defpackage.appendBackupVideoProfile;
import io.reactivex.BackpressureStrategy;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes4.dex */
final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    private final appendBackupVideoProfile scheduler;

    RxJava2CallAdapter(Type type, appendBackupVideoProfile appendbackupvideoprofile, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.responseType = type;
        this.scheduler = appendbackupvideoprofile;
        this.isAsync = z;
        this.isResult = z2;
        this.isBody = z3;
        this.isFlowable = z4;
        this.isSingle = z5;
        this.isMaybe = z6;
        this.isCompletable = z7;
    }

    @Override // retrofit2.CallAdapter
    public final Type responseType() {
        return this.responseType;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052 A[RETURN] */
    @Override // retrofit2.CallAdapter
    public final Object adapt(Call<R> call) {
        VideoRecordEventStart bodyObservable;
        appendBackupVideoProfile appendbackupvideoprofile;
        VideoRecordEventStart callEnqueueObservable = this.isAsync ? new CallEnqueueObservable(call) : new CallExecuteObservable(call);
        if (this.isResult) {
            bodyObservable = new ResultObservable(callEnqueueObservable);
        } else {
            if (this.isBody) {
                bodyObservable = new BodyObservable(callEnqueueObservable);
            }
            appendbackupvideoprofile = this.scheduler;
            if (appendbackupvideoprofile != null) {
                callEnqueueObservable = callEnqueueObservable.subscribeOn(appendbackupvideoprofile);
            }
            if (this.isFlowable) {
                return callEnqueueObservable.toFlowable(BackpressureStrategy.LATEST);
            }
            if (this.isSingle) {
                return callEnqueueObservable.singleOrError();
            }
            if (this.isMaybe) {
                return callEnqueueObservable.singleElement();
            }
            if (this.isCompletable) {
                return callEnqueueObservable.ignoreElements();
            }
            return callEnqueueObservable;
        }
        callEnqueueObservable = bodyObservable;
        appendbackupvideoprofile = this.scheduler;
        if (appendbackupvideoprofile != null) {
            callEnqueueObservable = callEnqueueObservable.subscribeOn(appendbackupvideoprofile);
        }
        if (this.isFlowable) {
            return callEnqueueObservable.toFlowable(BackpressureStrategy.LATEST);
        }
        if (this.isSingle) {
            return callEnqueueObservable.singleOrError();
        }
        if (this.isMaybe) {
            return callEnqueueObservable.singleElement();
        }
        if (this.isCompletable) {
            return callEnqueueObservable.ignoreElements();
        }
        return callEnqueueObservable;
    }
}
