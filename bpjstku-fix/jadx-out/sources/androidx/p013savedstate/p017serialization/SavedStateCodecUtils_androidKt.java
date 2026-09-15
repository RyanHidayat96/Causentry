package androidx.p013savedstate.p017serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.p013savedstate.p017serialization.serializers.CharSequenceSerializer;
import androidx.p013savedstate.p017serialization.serializers.DefaultParcelableSerializer;
import androidx.p013savedstate.p017serialization.serializers.SparseArraySerializer;
import defpackage.addExtraSupportedSize;
import defpackage.createImageAnalysis;
import defpackage.getFirstVideoProfile;
import defpackage.lambdaaccept0androidxcameraviewCameraController2;
import defpackage.unbindImageCaptureAndRecreate;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b%\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0002\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u0004\" \u0010\u000f\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0002\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0012\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0004\" \u0010\u0016\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0002\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0017\u0010\u0004\" \u0010\u0019\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0002\u0012\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0004\"\u001a\u0010\u001c\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0004\"\u001a\u0010\u001e\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u001a\u0010 \u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0004\"\u001a\u0010\"\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0004\"\u001a\u0010$\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004"}, d2 = {"LcreateImageAnalysis;", "polymorphicCharSequenceDescriptor", "LcreateImageAnalysis;", "getPolymorphicCharSequenceDescriptor", "()LcreateImageAnalysis;", "polymorphicParcelableDescriptor", "getPolymorphicParcelableDescriptor", "polymorphicJavaSerializableDescriptor", "getPolymorphicJavaSerializableDescriptor", "polymorphicIBinderDescriptor", "getPolymorphicIBinderDescriptor", "parcelableArrayDescriptor", "getParcelableArrayDescriptor", "getParcelableArrayDescriptor$annotations", "()V", "polymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor$annotations", "parcelableListDescriptor", "getParcelableListDescriptor", "polymorphicParcelableListDescriptor", "getPolymorphicParcelableListDescriptor", "charSequenceArrayDescriptor", "getCharSequenceArrayDescriptor", "getCharSequenceArrayDescriptor$annotations", "polymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor$annotations", "charSequenceListDescriptor", "getCharSequenceListDescriptor", "polymorphicCharSequenceListDescriptor", "getPolymorphicCharSequenceListDescriptor", "sparseParcelableArrayDescriptor", "getSparseParcelableArrayDescriptor", "polymorphicSparseParcelableArrayDescriptor", "getPolymorphicSparseParcelableArrayDescriptor", "nullablePolymorphicSparseParcelableArrayDescriptor", "getNullablePolymorphicSparseParcelableArrayDescriptor"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateCodecUtils_androidKt {
    private static final createImageAnalysis charSequenceArrayDescriptor;
    private static final createImageAnalysis charSequenceListDescriptor;
    private static final createImageAnalysis nullablePolymorphicSparseParcelableArrayDescriptor;
    private static final createImageAnalysis parcelableArrayDescriptor;
    private static final createImageAnalysis parcelableListDescriptor;
    private static final createImageAnalysis polymorphicCharSequenceArrayDescriptor;
    private static final createImageAnalysis polymorphicCharSequenceListDescriptor;
    private static final createImageAnalysis polymorphicParcelableArrayDescriptor;
    private static final createImageAnalysis polymorphicParcelableListDescriptor;
    private static final createImageAnalysis polymorphicSparseParcelableArrayDescriptor;
    private static final createImageAnalysis sparseParcelableArrayDescriptor;
    private static final createImageAnalysis polymorphicCharSequenceDescriptor = new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(CharSequence.class)).getDescriptor();
    private static final createImageAnalysis polymorphicParcelableDescriptor = new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(Parcelable.class)).getDescriptor();
    private static final createImageAnalysis polymorphicJavaSerializableDescriptor = new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(Serializable.class)).getDescriptor();
    private static final createImageAnalysis polymorphicIBinderDescriptor = new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(IBinder.class)).getDescriptor();

    public static /* synthetic */ void getCharSequenceArrayDescriptor$annotations() {
    }

    public static /* synthetic */ void getParcelableArrayDescriptor$annotations() {
    }

    public static /* synthetic */ void getPolymorphicCharSequenceArrayDescriptor$annotations() {
    }

    public static /* synthetic */ void getPolymorphicParcelableArrayDescriptor$annotations() {
    }

    public static final createImageAnalysis getPolymorphicCharSequenceDescriptor() {
        return polymorphicCharSequenceDescriptor;
    }

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Parcelable.class);
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(defaultParcelableSerializer, "");
        parcelableArrayDescriptor = new lambdaaccept0androidxcameraviewCameraController2(orCreateKotlinClass, defaultParcelableSerializer).getDescriptor();
        getFirstVideoProfile getfirstvideoprofile = new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(Parcelable.class));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Parcelable.class);
        Intrinsics.checkNotNullParameter(orCreateKotlinClass2, "");
        Intrinsics.checkNotNullParameter(getfirstvideoprofile, "");
        polymorphicParcelableArrayDescriptor = new lambdaaccept0androidxcameraviewCameraController2(orCreateKotlinClass2, getfirstvideoprofile).getDescriptor();
        DefaultParcelableSerializer defaultParcelableSerializer2 = DefaultParcelableSerializer.INSTANCE;
        Intrinsics.checkNotNullParameter(defaultParcelableSerializer2, "");
        parcelableListDescriptor = new unbindImageCaptureAndRecreate(defaultParcelableSerializer2).getDescriptor();
        getFirstVideoProfile getfirstvideoprofile2 = new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(Parcelable.class));
        Intrinsics.checkNotNullParameter(getfirstvideoprofile2, "");
        polymorphicParcelableListDescriptor = new unbindImageCaptureAndRecreate(getfirstvideoprofile2).getDescriptor();
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(CharSequence.class);
        Intrinsics.checkNotNullParameter(orCreateKotlinClass3, "");
        Intrinsics.checkNotNullParameter(charSequenceSerializer, "");
        charSequenceArrayDescriptor = new lambdaaccept0androidxcameraviewCameraController2(orCreateKotlinClass3, charSequenceSerializer).getDescriptor();
        getFirstVideoProfile getfirstvideoprofile3 = new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(CharSequence.class));
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(CharSequence.class);
        Intrinsics.checkNotNullParameter(orCreateKotlinClass4, "");
        Intrinsics.checkNotNullParameter(getfirstvideoprofile3, "");
        polymorphicCharSequenceArrayDescriptor = new lambdaaccept0androidxcameraviewCameraController2(orCreateKotlinClass4, getfirstvideoprofile3).getDescriptor();
        CharSequenceSerializer charSequenceSerializer2 = CharSequenceSerializer.INSTANCE;
        Intrinsics.checkNotNullParameter(charSequenceSerializer2, "");
        charSequenceListDescriptor = new unbindImageCaptureAndRecreate(charSequenceSerializer2).getDescriptor();
        getFirstVideoProfile getfirstvideoprofile4 = new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(CharSequence.class));
        Intrinsics.checkNotNullParameter(getfirstvideoprofile4, "");
        polymorphicCharSequenceListDescriptor = new unbindImageCaptureAndRecreate(getfirstvideoprofile4).getDescriptor();
        sparseParcelableArrayDescriptor = new SparseArraySerializer(DefaultParcelableSerializer.INSTANCE).getDescriptor();
        polymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        nullablePolymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getFirstVideoProfile(Reflection.getOrCreateKotlinClass(Parcelable.class)))).getDescriptor();
    }

    public static final createImageAnalysis getPolymorphicParcelableDescriptor() {
        return polymorphicParcelableDescriptor;
    }

    public static final createImageAnalysis getPolymorphicJavaSerializableDescriptor() {
        return polymorphicJavaSerializableDescriptor;
    }

    public static final createImageAnalysis getPolymorphicIBinderDescriptor() {
        return polymorphicIBinderDescriptor;
    }

    public static final createImageAnalysis getParcelableArrayDescriptor() {
        return parcelableArrayDescriptor;
    }

    public static final createImageAnalysis getPolymorphicParcelableArrayDescriptor() {
        return polymorphicParcelableArrayDescriptor;
    }

    public static final createImageAnalysis getParcelableListDescriptor() {
        return parcelableListDescriptor;
    }

    public static final createImageAnalysis getPolymorphicParcelableListDescriptor() {
        return polymorphicParcelableListDescriptor;
    }

    public static final createImageAnalysis getCharSequenceArrayDescriptor() {
        return charSequenceArrayDescriptor;
    }

    public static final createImageAnalysis getPolymorphicCharSequenceArrayDescriptor() {
        return polymorphicCharSequenceArrayDescriptor;
    }

    public static final createImageAnalysis getCharSequenceListDescriptor() {
        return charSequenceListDescriptor;
    }

    public static final createImageAnalysis getPolymorphicCharSequenceListDescriptor() {
        return polymorphicCharSequenceListDescriptor;
    }

    public static final createImageAnalysis getSparseParcelableArrayDescriptor() {
        return sparseParcelableArrayDescriptor;
    }

    public static final createImageAnalysis getPolymorphicSparseParcelableArrayDescriptor() {
        return polymorphicSparseParcelableArrayDescriptor;
    }

    public static final createImageAnalysis getNullablePolymorphicSparseParcelableArrayDescriptor() {
        return nullablePolymorphicSparseParcelableArrayDescriptor;
    }
}
