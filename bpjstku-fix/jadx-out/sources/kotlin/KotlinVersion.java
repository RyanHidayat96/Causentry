package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001a"}, d2 = {"Lkotlin/KotlinVersion;", "", "", "p0", "p1", "p2", "<init>", "(III)V", "(II)V", "versionOf", "(III)I", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "compareTo", "(Lkotlin/KotlinVersion;)I", "isAtLeast", "(II)Z", "(III)Z", "major", "I", "getMajor", "minor", "getMinor", "patch", "getPatch", "version", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final KotlinVersion CURRENT = KotlinVersionCurrentValue.get();

    public KotlinVersion(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.version = versionOf(i, i2, i3);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public KotlinVersion(int i, int i2) {
        this(i, i2, 0);
    }

    private final int versionOf(int p0, int p1, int p2) {
        if (p0 >= 0 && p0 < 256 && p1 >= 0 && p1 < 256 && p2 >= 0 && p2 < 256) {
            return (p0 << 16) + (p1 << 8) + p2;
        }
        StringBuilder sb = new StringBuilder("Version components are out of range: ");
        sb.append(p0);
        sb.append('.');
        sb.append(p1);
        sb.append('.');
        sb.append(p2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        KotlinVersion kotlinVersion = p0 instanceof KotlinVersion ? (KotlinVersion) p0 : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Override // java.lang.Comparable
    public final int compareTo(KotlinVersion p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.version - p0.version;
    }

    public final boolean isAtLeast(int p0, int p1) {
        int i = this.major;
        if (i <= p0) {
            return i == p0 && this.minor >= p1;
        }
        return true;
    }

    public final boolean isAtLeast(int p0, int p1, int p2) {
        int i = this.major;
        if (i > p0) {
            return true;
        }
        if (i != p0) {
            return false;
        }
        int i2 = this.minor;
        if (i2 <= p1) {
            return i2 == p1 && this.patch >= p2;
        }
        return true;
    }
}
