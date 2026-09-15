package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_AudioEncoderConfig extends isEndOfStream implements MimeInfoBuilder {
    @Override // defpackage.MimeInfoBuilder
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
    public final AutoValue_AudioEncoderConfig getTuitionPaymentFragmentbindingInflater1() {
        return this;
    }

    @Override // defpackage.MimeInfoBuilder
    public final boolean k_() {
        return true;
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig = this;
        Object objAsBinder = autoValue_AudioEncoderConfig.asBinder();
        Intrinsics.checkNotNull(objAsBinder, "");
        boolean z = true;
        for (lambdasendEncodedData3 lambdasendencodeddata3D = (lambdasendEncodedData3) objAsBinder; !Intrinsics.areEqual(lambdasendencodeddata3D, autoValue_AudioEncoderConfig); lambdasendencodeddata3D = lambdasendencodeddata3D.d()) {
            if (lambdasendencodeddata3D instanceof getInputTimebase) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(lambdasendencodeddata3D);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // defpackage.lambdasendEncodedData3
    public final String toString() {
        return scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault2() ? TuitionPaymentFragmentspecialinlinedviewModeldefault3("Active") : super.toString();
    }
}
