package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0000\n\u0002\u0010\f\n\u0000\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u001c8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d"}, d2 = {"LSurfaceViewImplementationExternalSyntheticLambda1;", "", "Lokio/ByteString;", "p0", "<init>", "(Lokio/ByteString;)V", "", "b", "(Ljava/lang/String;)LSurfaceViewImplementationExternalSyntheticLambda1;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LSurfaceViewImplementationExternalSyntheticLambda1;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lokio/ByteString;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lokio/ByteString;", "()LSurfaceViewImplementationExternalSyntheticLambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "()Ljava/util/List;", "", "()Ljava/lang/Character;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SurfaceViewImplementationExternalSyntheticLambda1 implements Comparable<SurfaceViewImplementationExternalSyntheticLambda1> {
    public static final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final ByteString TuitionPaymentFragmentbindingInflater1;

    public SurfaceViewImplementationExternalSyntheticLambda1(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        this.TuitionPaymentFragmentbindingInflater1 = byteString;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = surfaceViewImplementationExternalSyntheticLambda1;
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
        return this.TuitionPaymentFragmentbindingInflater1.compareTo(surfaceViewImplementationExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1);
    }

    public static /* synthetic */ SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
        return surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, surfaceViewImplementationExternalSyntheticLambda2, false);
    }

    /* JADX INFO: renamed from: SurfaceViewImplementationExternalSyntheticLambda1$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, true);
        }

        public static /* synthetic */ SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, false);
        }

        public static /* synthetic */ SurfaceViewImplementationExternalSyntheticLambda1 b(Companion companion, File file) {
            Intrinsics.checkNotNullParameter(file, "");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Intrinsics.checkNotNullParameter(string, "");
            return surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, false);
        }

        public static /* synthetic */ SurfaceViewImplementationExternalSyntheticLambda1 R_(Companion companion, Path path) {
            Intrinsics.checkNotNullParameter(path, "");
            String string = path.toString();
            Intrinsics.checkNotNullParameter(string, "");
            return surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, false);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "");
        TuitionPaymentFragmentbindingInflater1 = str;
    }

    private List<ByteString> b() {
        ArrayList arrayList = new ArrayList();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() && this.TuitionPaymentFragmentbindingInflater1.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault3) == 92) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < iTuitionPaymentFragmentspecialinlinedviewModeldefault4) {
            if (this.TuitionPaymentFragmentbindingInflater1.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault3) == 47 || this.TuitionPaymentFragmentbindingInflater1.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault3) == 92) {
                arrayList.add(this.TuitionPaymentFragmentbindingInflater1.b(i, iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                i = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        }
        if (i < this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            ByteString byteString = this.TuitionPaymentFragmentbindingInflater1;
            arrayList.add(byteString.b(i, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
        }
        return arrayList;
    }

    public final ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentbindingInflater1 = surfaceChanged.TuitionPaymentFragmentbindingInflater1(this);
        if (iTuitionPaymentFragmentbindingInflater1 != -1) {
            return ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater1 + 1, 0, 2);
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null && this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == 2) {
            return ByteString.EMPTY;
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public final SurfaceViewImplementationExternalSyntheticLambda1 b(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter(p0, "");
        return surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.b(p0, 0, p0.length()), false), false);
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof SurfaceViewImplementationExternalSyntheticLambda1) && Intrinsics.areEqual(((SurfaceViewImplementationExternalSyntheticLambda1) p0).TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1() {
        if (Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, surfaceChanged.TuitionPaymentFragmentbindingInflater1) || Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, surfaceChanged.b) || surfaceChanged.b(this)) {
            return null;
        }
        int iTuitionPaymentFragmentbindingInflater1 = surfaceChanged.TuitionPaymentFragmentbindingInflater1(this);
        if (iTuitionPaymentFragmentbindingInflater1 != 2 || TuitionPaymentFragmentspecialinlinedviewModeldefault1() == null) {
            if (iTuitionPaymentFragmentbindingInflater1 == 1) {
                ByteString byteString = this.TuitionPaymentFragmentbindingInflater1;
                ByteString byteString2 = surfaceChanged.b;
                Intrinsics.checkNotNullParameter(byteString2, "");
                if (byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0, byteString2, byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                    return null;
                }
            }
            if (iTuitionPaymentFragmentbindingInflater1 == -1 && TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
                if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == 2) {
                    return null;
                }
                return new SurfaceViewImplementationExternalSyntheticLambda1(ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, 0, 2, 1));
            }
            if (iTuitionPaymentFragmentbindingInflater1 == -1) {
                return new SurfaceViewImplementationExternalSyntheticLambda1(surfaceChanged.TuitionPaymentFragmentbindingInflater1);
            }
            if (iTuitionPaymentFragmentbindingInflater1 == 0) {
                return new SurfaceViewImplementationExternalSyntheticLambda1(ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, 0, 1, 1));
            }
            return new SurfaceViewImplementationExternalSyntheticLambda1(ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, 0, iTuitionPaymentFragmentbindingInflater1, 1));
        }
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == 3) {
            return null;
        }
        return new SurfaceViewImplementationExternalSyntheticLambda1(ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, 0, 3, 1));
    }

    public final SurfaceViewImplementationExternalSyntheticLambda1 b(SurfaceViewImplementationExternalSyntheticLambda1 p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 ? null : new SurfaceViewImplementationExternalSyntheticLambda1(this.TuitionPaymentFragmentbindingInflater1.b(0, iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        if (!Intrinsics.areEqual(surfaceViewImplementationExternalSyntheticLambda1, iTuitionPaymentFragmentspecialinlinedviewModeldefault4 != -1 ? new SurfaceViewImplementationExternalSyntheticLambda1(p0.TuitionPaymentFragmentbindingInflater1.b(0, iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) : null)) {
            StringBuilder sb = new StringBuilder("Paths of different roots cannot be relative to each other: ");
            sb.append(this);
            sb.append(" and ");
            sb.append(p0);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        List<ByteString> listB = b();
        List<ByteString> listB2 = p0.b();
        int iMin = Math.min(listB.size(), listB2.size());
        int i = 0;
        while (i < iMin && Intrinsics.areEqual(listB.get(i), listB2.get(i))) {
            i++;
        }
        if (i != iMin || this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != p0.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            if (listB2.subList(i, listB2.size()).indexOf(surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3) != -1) {
                StringBuilder sb2 = new StringBuilder("Impossible relative path to resolve: ");
                sb2.append(this);
                sb2.append(" and ");
                sb2.append(p0);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
            if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this)) == null) {
                byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceChanged.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1);
            }
            int size = listB2.size();
            for (int i2 = i; i2 < size; i2++) {
                ByteString byteString = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Intrinsics.checkNotNullParameter(byteString, "");
                byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
                byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
            int size2 = listB.size();
            while (i < size2) {
                ByteString byteString2 = listB.get(i);
                Intrinsics.checkNotNullParameter(byteString2, "");
                byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
                byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                i++;
            }
            return surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper, false);
        }
        return Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(".");
    }

    public final String toString() {
        return this.TuitionPaymentFragmentbindingInflater1.asInterface();
    }

    public final Character TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != -1 || this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() < 2 || this.TuitionPaymentFragmentbindingInflater1.b(1) != 58) {
            return null;
        }
        char cB = (char) this.TuitionPaymentFragmentbindingInflater1.b(0);
        if (('a' > cB || cB >= '{') && ('A' > cB || cB >= '[')) {
            return null;
        }
        return Character.valueOf(cB);
    }
}
