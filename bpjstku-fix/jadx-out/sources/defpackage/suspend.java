package defpackage;

import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f"}, d2 = {"Lsuspend;", "LfinalizeWithError;", "LappendBackupVideoProfile;", "p0", "p1", "<init>", "(LappendBackupVideoProfile;LappendBackupVideoProfile;)V", "LVideoEncoderSession1;", "LVideoEncoderSessionExternalSyntheticLambda6;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LVideoEncoderSession1;)LVideoEncoderSessionExternalSyntheticLambda6;", "b", "LappendBackupVideoProfile;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 3, 0})
public final class suspend implements finalizeWithError {
    private final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1;

    public suspend(appendBackupVideoProfile appendbackupvideoprofile, appendBackupVideoProfile appendbackupvideoprofile2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendbackupvideoprofile;
        this.TuitionPaymentFragmentbindingInflater1 = appendbackupvideoprofile2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ suspend(appendBackupVideoProfile appendbackupvideoprofile, appendBackupVideoProfile appendbackupvideoprofile2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            appendbackupvideoprofile = isSamsungJ2.b();
            Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofile, "");
        }
        if ((i & 2) != 0) {
            appendbackupvideoprofile2 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
            Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofile2, "");
        }
        this(appendbackupvideoprofile, appendbackupvideoprofile2);
    }

    @Override // defpackage.finalizeWithError
    public final VideoEncoderSessionExternalSyntheticLambda6 TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoEncoderSession1 p0) {
        appendBackupVideoProfile appendbackupvideoprofile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        share.b(appendbackupvideoprofile, "scheduler is null");
        CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(p0, appendbackupvideoprofile);
        appendBackupVideoProfile appendbackupvideoprofile2 = this.TuitionPaymentFragmentbindingInflater1;
        share.b(appendbackupvideoprofile2, "scheduler is null");
        CompletableObserveOn completableObserveOn = new CompletableObserveOn(completableSubscribeOn, appendbackupvideoprofile2);
        Intrinsics.checkExpressionValueIsNotNull(completableObserveOn, "");
        return completableObserveOn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public suspend() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
