package com.bpjstku.data.setting.model.request;

import android.graphics.ImageFormat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "getNewPassword", "oldPassword", "getOldPassword", "confirmedNewPassword", "getConfirmedNewPassword"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChangePasswordRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("konfKataSandiBaru")
    private final String confirmedNewPassword;

    @SerializedName("email")
    private final String email;

    @SerializedName("kataSandiBaru")
    private final String newPassword;

    @SerializedName("kataSandiLama")
    private final String oldPassword;

    public final String getEmail() {
        return this.email;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getOldPassword() {
        return this.oldPassword;
    }

    public final String getConfirmedNewPassword() {
        return this.confirmedNewPassword;
    }

    public ChangePasswordRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.email = str;
        this.newPassword = str2;
        this.oldPassword = str3;
        this.confirmedNewPassword = str4;
    }

    public final String component1() throws IllegalAccessException {
        String str = this.email;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 40, ImageFormat.getBitsPerPixel(0) + 20, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 37836), TextUtils.getCapsMode("", 0, 0) + 59, 18 - (ViewConfiguration.getTouchSlop() >> 8), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59, View.getDefaultSize(0, 0) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 140;
        long jIdentityHashCode = System.identityHashCode(this);
        long j3 = -1;
        long j4 = (j3 ^ 1834773009829084109L) | 3684480487330702130L;
        long j5 = jIdentityHashCode ^ j3;
        long j6 = (((long) 141) * 1834773009829084109L) + (((long) (-279)) * 3684480487330702130L) + ((jIdentityHashCode | 3684480487330702130L) * j2) + (((long) (-280)) * ((j4 ^ j3) | ((j5 | 3684480487330702130L) ^ j3))) + (j2 * (((j4 | jIdentityHashCode) ^ j3) | (((j3 ^ 3684480487330702130L) | 1834773009829084109L) ^ j3) | ((j5 | 1834773009829084109L) ^ j3)));
        int i4 = i3;
        long j7 = j;
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i4 = (((((int) (j7 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j7 = j6;
        }
        if (i4 == i) {
            return str;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 46401), 39 - TextUtils.indexOf((CharSequence) "", '0'), View.MeasureSpec.makeMeasureSpec(0, 0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
        }
        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
        throw new RuntimeException(String.valueOf(i2));
    }

    public static /* synthetic */ ChangePasswordRequest copy$default(ChangePasswordRequest changePasswordRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePasswordRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = changePasswordRequest.newPassword;
        }
        if ((i & 4) != 0) {
            str3 = changePasswordRequest.oldPassword;
        }
        if ((i & 8) != 0) {
            str4 = changePasswordRequest.confirmedNewPassword;
        }
        return changePasswordRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNewPassword() {
        return this.newPassword;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOldPassword() {
        return this.oldPassword;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConfirmedNewPassword() {
        return this.confirmedNewPassword;
    }

    public final ChangePasswordRequest copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new ChangePasswordRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ChangePasswordRequest)) {
            return false;
        }
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) p0;
        return Intrinsics.areEqual(this.email, changePasswordRequest.email) && Intrinsics.areEqual(this.newPassword, changePasswordRequest.newPassword) && Intrinsics.areEqual(this.oldPassword, changePasswordRequest.oldPassword) && Intrinsics.areEqual(this.confirmedNewPassword, changePasswordRequest.confirmedNewPassword);
    }

    public final int hashCode() {
        return (((((this.email.hashCode() * 31) + this.newPassword.hashCode()) * 31) + this.oldPassword.hashCode()) * 31) + this.confirmedNewPassword.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.newPassword;
        String str3 = this.oldPassword;
        String str4 = this.confirmedNewPassword;
        StringBuilder sb = new StringBuilder("ChangePasswordRequest(email=");
        sb.append(str);
        sb.append(", newPassword=");
        sb.append(str2);
        sb.append(", oldPassword=");
        sb.append(str3);
        sb.append(", confirmedNewPassword=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
