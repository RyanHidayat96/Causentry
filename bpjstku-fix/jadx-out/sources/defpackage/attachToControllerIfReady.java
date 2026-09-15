package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nJ'\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LattachToControllerIfReady;", "", "LcreateImageAnalysis;", "p0", "", "p1", "", "p2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LcreateImageAnalysis;Ljava/lang/String;)Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface attachToControllerIfReady {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.TuitionPaymentFragmentbindingInflater1;

    String TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis, String str);

    /* JADX INFO: renamed from: attachToControllerIfReady$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion TuitionPaymentFragmentbindingInflater1 = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: attachToControllerIfReady$TuitionPaymentFragmentspecialinlinedviewModeldefault2$b */
        public static final class b implements attachToControllerIfReady {
            b() {
            }

            @Override // defpackage.attachToControllerIfReady
            public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis, String str) {
                Intrinsics.checkNotNullParameter(createimageanalysis, "");
                Intrinsics.checkNotNullParameter(str, "");
                Companion companion = Companion.TuitionPaymentFragmentbindingInflater1;
                return Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, '_');
            }

            public final String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        }

        static {
            new b();
            new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        /* JADX INFO: renamed from: attachToControllerIfReady$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
        public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements attachToControllerIfReady {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            }

            @Override // defpackage.attachToControllerIfReady
            public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis, String str) {
                Intrinsics.checkNotNullParameter(createimageanalysis, "");
                Intrinsics.checkNotNullParameter(str, "");
                Companion companion = Companion.TuitionPaymentFragmentbindingInflater1;
                return Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, '-');
            }

            public final String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        }

        public static final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, char c) {
            StringBuilder sb = new StringBuilder(str.length() * 2);
            String str2 = str;
            Character chValueOf = null;
            int i = 0;
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char cCharAt = str2.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    if (i == 0) {
                        StringBuilder sb2 = sb;
                        if (sb2.length() > 0 && StringsKt.last(sb2) != c) {
                            sb.append(c);
                        }
                    }
                    if (chValueOf != null) {
                        sb.append(chValueOf.charValue());
                    }
                    i++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i > 1 && Character.isLetter(cCharAt)) {
                            sb.append(c);
                        }
                        sb.append(chValueOf.charValue());
                        chValueOf = null;
                        i = 0;
                    }
                    sb.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb.append(chValueOf.charValue());
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }
}
