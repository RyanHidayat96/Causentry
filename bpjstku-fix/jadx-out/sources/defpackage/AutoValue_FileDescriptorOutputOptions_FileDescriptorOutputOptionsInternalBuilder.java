package defpackage;

import android.content.Intent;
import com.google.android.libraries.places.api.model.Place;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003"}, d2 = {"LAutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 3, 0})
public final class AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder {
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
    private static String b = "";
    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public final Intent TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Intent();
    }

    /* JADX INFO: renamed from: AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\f\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u000f\u0010\u0013R\"\u0010\f\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\n\u0010\u000eR\u001c\u0010\u0007\u001a\u00020\t8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0014\u0010\r"}, d2 = {"LAutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lcom/google/android/libraries/places/api/model/Place;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Intent;)Lcom/google/android/libraries/places/api/model/Place;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "Z", "()Z", "(Z)V", "b"}, k = 1, mv = {2, 3, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static String TuitionPaymentFragmentbindingInflater1() {
            return AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public static void TuitionPaymentFragmentbindingInflater1(String str) {
            AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.b;
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.b = str;
        }

        public static String b() {
            return AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
            AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        }

        public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @JvmStatic
        public static Place TuitionPaymentFragmentspecialinlinedviewModeldefault3(Intent p0) {
            return (Place) p0.getParcelableExtra("extra_place");
        }
    }
}
