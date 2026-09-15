package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t"}, d2 = {"LlambdasubmitStillCaptureRequests2;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "", "code", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/lang/Object;", NotificationCompat.CATEGORY_STATUS, "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 3, 0})
public final class lambdasubmitStillCaptureRequests2<T> {

    @SerializedName("code")
    private final String code;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final T data;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.data;
    }
}
