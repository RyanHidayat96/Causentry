package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/autofill/AndroidContentDataType;", "Landroidx/compose/ui/autofill/ContentDataType;", "", "p0", "constructor-impl", "(I)I", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "androidAutofillType", "I", "getAndroidAutofillType", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3721constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3723equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ AndroidContentDataType(int i) {
        this.androidAutofillType = i;
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m3720boximpl(int i) {
        return new AndroidContentDataType(i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3722equalsimpl(int i, Object obj) {
        return (obj instanceof AndroidContentDataType) && i == ((AndroidContentDataType) obj).m3726unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3724hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3725toStringimpl(int i) {
        StringBuilder sb = new StringBuilder("AndroidContentDataType(androidAutofillType=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return m3722equalsimpl(this.androidAutofillType, obj);
    }

    public final int hashCode() {
        return m3724hashCodeimpl(this.androidAutofillType);
    }

    public final String toString() {
        return m3725toStringimpl(this.androidAutofillType);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3726unboximpl() {
        return this.androidAutofillType;
    }
}
