package androidx.p013savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u001d\u0010)\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0015\u0010,\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J'\u00101\u001a\u00020\n\"\b\b\u0000\u0010.*\u00020-2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J'\u00105\u001a\u00020\n\"\b\b\u0000\u0010.*\u0002022\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b3\u00104J\u001d\u00109\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u000206¢\u0006\u0004\b7\u00108J\u001d\u0010=\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b>\u0010?J#\u0010D\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\"0A¢\u0006\u0004\bB\u0010CJ#\u0010F\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00160A¢\u0006\u0004\bE\u0010CJ'\u0010H\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030A¢\u0006\u0004\bG\u0010CJ#\u0010J\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070A¢\u0006\u0004\bI\u0010CJ-\u0010L\u001a\u00020\n\"\b\b\u0000\u0010.*\u00020-2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\bK\u0010CJ\u001d\u0010P\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020M¢\u0006\u0004\bN\u0010OJ\u001d\u0010T\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ#\u0010X\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00160U¢\u0006\u0004\bV\u0010WJ\u001d\u0010\\\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020Y¢\u0006\u0004\bZ\u0010[J\u001d\u0010`\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020]¢\u0006\u0004\b^\u0010_J\u001d\u0010d\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020a¢\u0006\u0004\bb\u0010cJ\u001d\u0010h\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020e¢\u0006\u0004\bf\u0010gJ'\u0010k\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030U¢\u0006\u0004\bi\u0010jJ#\u0010n\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070U¢\u0006\u0004\bl\u0010mJ-\u0010q\u001a\u00020\n\"\b\b\u0000\u0010.*\u00020-2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000U¢\u0006\u0004\bo\u0010pJ-\u0010u\u001a\u00020\n\"\b\b\u0000\u0010.*\u00020-2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000r¢\u0006\u0004\bs\u0010tJ!\u0010x\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\bv\u0010wJ\u0019\u0010{\u001a\u00020\n2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\by\u0010zJ\u0015\u0010}\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b|\u0010+J\u000e\u0010\u0080\u0001\u001a\u00020\n¢\u0006\u0004\b~\u0010\u007fJ\u001d\u0010\u0083\u0001\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0013\u0010\u0086\u0001\u001a\u00020\"HÖ\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0013\u0010\u0089\u0001\u001a\u00020\u0007HÖ\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u008a\u0001\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u0088\u0001\u008a\u0001\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Landroidx/savedstate/SavedStateWriter;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "Landroid/os/IBinder;", "p1", "", "putBinder-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V", "putBinder", "", "putBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "putBoolean", "", "putChar-impl", "(Landroid/os/Bundle;Ljava/lang/String;C)V", "putChar", "", "putCharSequence-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/CharSequence;)V", "putCharSequence", "", "putDouble-impl", "(Landroid/os/Bundle;Ljava/lang/String;D)V", "putDouble", "", "putFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "putFloat", "", "putInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "putInt", "", "putLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "putLong", "putNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)V", "putNull", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, "putParcelable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V", "putParcelable", "Ljava/io/Serializable;", "putJavaSerializable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "putJavaSerializable", "Landroid/util/Size;", "putSize-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "putSize", "Landroid/util/SizeF;", "putSizeF-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "putSizeF", "putString-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "putString", "", "putIntList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "putIntList", "putCharSequenceList-impl", "putCharSequenceList", "putSavedStateList-impl", "putSavedStateList", "putStringList-impl", "putStringList", "putParcelableList-impl", "putParcelableList", "", "putBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "putBooleanArray", "", "putCharArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[C)V", "putCharArray", "", "putCharSequenceArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/CharSequence;)V", "putCharSequenceArray", "", "putDoubleArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[D)V", "putDoubleArray", "", "putFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "putFloatArray", "", "putIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "putIntArray", "", "putLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "putLongArray", "putSavedStateArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Bundle;)V", "putSavedStateArray", "putStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "putStringArray", "putParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "putParcelableArray", "Landroid/util/SparseArray;", "putSparseParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SparseArray;)V", "putSparseParcelableArray", "putSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "putSavedState", "putAll-impl", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "putAll", "remove-impl", "remove", "clear-impl", "(Landroid/os/Bundle;)V", "clear", "equals-impl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "equals", "hashCode-impl", "(Landroid/os/Bundle;)I", "hashCode", "toString-impl", "(Landroid/os/Bundle;)Ljava/lang/String;", "toString", "source", "Landroid/os/Bundle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class SavedStateWriter {
    private final Bundle source;

    private /* synthetic */ SavedStateWriter(Bundle bundle) {
        this.source = bundle;
    }

    /* JADX INFO: renamed from: putBinder-impl, reason: not valid java name */
    public static final void m7459putBinderimpl(Bundle bundle, String str, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iBinder, "");
        bundle.putBinder(str, iBinder);
    }

    /* JADX INFO: renamed from: putBoolean-impl, reason: not valid java name */
    public static final void m7460putBooleanimpl(Bundle bundle, String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        bundle.putBoolean(str, z);
    }

    /* JADX INFO: renamed from: putChar-impl, reason: not valid java name */
    public static final void m7462putCharimpl(Bundle bundle, String str, char c) {
        Intrinsics.checkNotNullParameter(str, "");
        bundle.putChar(str, c);
    }

    /* JADX INFO: renamed from: putCharSequence-impl, reason: not valid java name */
    public static final void m7464putCharSequenceimpl(Bundle bundle, String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        bundle.putCharSequence(str, charSequence);
    }

    /* JADX INFO: renamed from: putDouble-impl, reason: not valid java name */
    public static final void m7467putDoubleimpl(Bundle bundle, String str, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        bundle.putDouble(str, d);
    }

    /* JADX INFO: renamed from: putFloat-impl, reason: not valid java name */
    public static final void m7469putFloatimpl(Bundle bundle, String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        bundle.putFloat(str, f);
    }

    /* JADX INFO: renamed from: putInt-impl, reason: not valid java name */
    public static final void m7471putIntimpl(Bundle bundle, String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        bundle.putInt(str, i);
    }

    /* JADX INFO: renamed from: putLong-impl, reason: not valid java name */
    public static final void m7475putLongimpl(Bundle bundle, String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        bundle.putLong(str, j);
    }

    /* JADX INFO: renamed from: putNull-impl, reason: not valid java name */
    public static final void m7477putNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        bundle.putString(str, null);
    }

    /* JADX INFO: renamed from: putParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m7478putParcelableimpl(Bundle bundle, String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        bundle.putParcelable(str, t);
    }

    /* JADX INFO: renamed from: putJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> void m7474putJavaSerializableimpl(Bundle bundle, String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        bundle.putSerializable(str, t);
    }

    /* JADX INFO: renamed from: putSize-impl, reason: not valid java name */
    public static final void m7484putSizeimpl(Bundle bundle, String str, Size size) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(size, "");
        bundle.putSize(str, size);
    }

    /* JADX INFO: renamed from: putSizeF-impl, reason: not valid java name */
    public static final void m7485putSizeFimpl(Bundle bundle, String str, SizeF sizeF) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sizeF, "");
        bundle.putSizeF(str, sizeF);
    }

    /* JADX INFO: renamed from: putString-impl, reason: not valid java name */
    public static final void m7487putStringimpl(Bundle bundle, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        bundle.putString(str, str2);
    }

    /* JADX INFO: renamed from: putIntList-impl, reason: not valid java name */
    public static final void m7473putIntListimpl(Bundle bundle, String str, List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        bundle.putIntegerArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* JADX INFO: renamed from: putCharSequenceList-impl, reason: not valid java name */
    public static final void m7466putCharSequenceListimpl(Bundle bundle, String str, List<? extends CharSequence> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        bundle.putCharSequenceArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* JADX INFO: renamed from: putSavedStateList-impl, reason: not valid java name */
    public static final void m7483putSavedStateListimpl(Bundle bundle, String str, List<Bundle> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        m7480putParcelableListimpl(bundle, str, list);
    }

    /* JADX INFO: renamed from: putStringList-impl, reason: not valid java name */
    public static final void m7489putStringListimpl(Bundle bundle, String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        bundle.putStringArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* JADX INFO: renamed from: putParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m7480putParcelableListimpl(Bundle bundle, String str, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        bundle.putParcelableArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* JADX INFO: renamed from: putBooleanArray-impl, reason: not valid java name */
    public static final void m7461putBooleanArrayimpl(Bundle bundle, String str, boolean[] zArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(zArr, "");
        bundle.putBooleanArray(str, zArr);
    }

    /* JADX INFO: renamed from: putCharArray-impl, reason: not valid java name */
    public static final void m7463putCharArrayimpl(Bundle bundle, String str, char[] cArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        bundle.putCharArray(str, cArr);
    }

    /* JADX INFO: renamed from: putCharSequenceArray-impl, reason: not valid java name */
    public static final void m7465putCharSequenceArrayimpl(Bundle bundle, String str, CharSequence[] charSequenceArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequenceArr, "");
        bundle.putCharSequenceArray(str, charSequenceArr);
    }

    /* JADX INFO: renamed from: putDoubleArray-impl, reason: not valid java name */
    public static final void m7468putDoubleArrayimpl(Bundle bundle, String str, double[] dArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dArr, "");
        bundle.putDoubleArray(str, dArr);
    }

    /* JADX INFO: renamed from: putFloatArray-impl, reason: not valid java name */
    public static final void m7470putFloatArrayimpl(Bundle bundle, String str, float[] fArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        bundle.putFloatArray(str, fArr);
    }

    /* JADX INFO: renamed from: putIntArray-impl, reason: not valid java name */
    public static final void m7472putIntArrayimpl(Bundle bundle, String str, int[] iArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        bundle.putIntArray(str, iArr);
    }

    /* JADX INFO: renamed from: putLongArray-impl, reason: not valid java name */
    public static final void m7476putLongArrayimpl(Bundle bundle, String str, long[] jArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jArr, "");
        bundle.putLongArray(str, jArr);
    }

    /* JADX INFO: renamed from: putSavedStateArray-impl, reason: not valid java name */
    public static final void m7482putSavedStateArrayimpl(Bundle bundle, String str, Bundle[] bundleArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundleArr, "");
        m7479putParcelableArrayimpl(bundle, str, bundleArr);
    }

    /* JADX INFO: renamed from: putStringArray-impl, reason: not valid java name */
    public static final void m7488putStringArrayimpl(Bundle bundle, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        bundle.putStringArray(str, strArr);
    }

    /* JADX INFO: renamed from: putParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m7479putParcelableArrayimpl(Bundle bundle, String str, T[] tArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        bundle.putParcelableArray(str, tArr);
    }

    /* JADX INFO: renamed from: putSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m7486putSparseParcelableArrayimpl(Bundle bundle, String str, SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sparseArray, "");
        bundle.putSparseParcelableArray(str, sparseArray);
    }

    /* JADX INFO: renamed from: putSavedState-impl, reason: not valid java name */
    public static final void m7481putSavedStateimpl(Bundle bundle, String str, Bundle bundle2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle2, "");
        bundle.putBundle(str, bundle2);
    }

    /* JADX INFO: renamed from: putAll-impl, reason: not valid java name */
    public static final void m7458putAllimpl(Bundle bundle, Bundle bundle2) {
        Intrinsics.checkNotNullParameter(bundle2, "");
        bundle.putAll(bundle2);
    }

    /* JADX INFO: renamed from: remove-impl, reason: not valid java name */
    public static final void m7490removeimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        bundle.remove(str);
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m7453clearimpl(Bundle bundle) {
        bundle.clear();
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateWriter m7452boximpl(Bundle bundle) {
        return new SavedStateWriter(bundle);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m7454constructorimpl(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return bundle;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7455equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && Intrinsics.areEqual(bundle, ((SavedStateWriter) obj).getSource());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7456equalsimpl0(Bundle bundle, Bundle bundle2) {
        return Intrinsics.areEqual(bundle, bundle2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7457hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7491toStringimpl(Bundle bundle) {
        StringBuilder sb = new StringBuilder("SavedStateWriter(source=");
        sb.append(bundle);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return m7455equalsimpl(this.source, obj);
    }

    public final int hashCode() {
        return m7457hashCodeimpl(this.source);
    }

    public final String toString() {
        return m7491toStringimpl(this.source);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }
}
