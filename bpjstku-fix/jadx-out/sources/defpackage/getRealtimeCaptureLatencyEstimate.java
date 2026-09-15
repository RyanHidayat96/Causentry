package defpackage;

import com.datadog.android.api.InternalLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LgetRealtimeCaptureLatencyEstimate;", "LgetJpegQuality;", "<init>", "()V", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getRealtimeCaptureLatencyEstimate implements getJpegQuality {
    @Override // defpackage.getJpegQuality
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = p0.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
            return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.datadog.android.core.internal.Sha256HashGenerator$generate$1
                public final CharSequence TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte b) {
                    String str = String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CharSequence invoke(Byte b) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault2(b.byteValue());
                }
            }, 30, (Object) null);
        } catch (NoSuchAlgorithmException e2) {
            resizeAveraging.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.Sha256HashGenerator$generate$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Cannot generate SHA-256 hash.";
                }
            }, e2, false, null);
            return null;
        }
    }
}
