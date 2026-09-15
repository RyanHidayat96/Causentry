package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class surfaceChanged {
    private static final ByteString TuitionPaymentFragmentbindingInflater1;
    private static final ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final ByteString b;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("/");
        ByteString.Companion companion2 = ByteString.INSTANCE;
        b = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\\");
        ByteString.Companion companion3 = ByteString.INSTANCE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("/\\");
        ByteString.Companion companion4 = ByteString.INSTANCE;
        TuitionPaymentFragmentbindingInflater1 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(".");
        ByteString.Companion companion5 = ByteString.INSTANCE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("..");
    }

    public static final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter(str, "");
        return TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.b(str, 0, str.length()), z);
    }

    public static final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1(RotationProviderListenerWrapper rotationProviderListenerWrapper, boolean z) throws EOFException {
        ByteString byteString;
        ByteString byteStringTuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        int i = 0;
        while (true) {
            ByteString byteString2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullParameter(byteString2, "");
            if (!rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0L, byteString2, byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                byteString = b;
                Intrinsics.checkNotNullParameter(byteString, "");
                if (!rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0L, byteString, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                    break;
                }
            }
            byte bCancel = rotationProviderListenerWrapper.cancel();
            if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(bCancel);
            }
            i++;
        }
        boolean z2 = i >= 2 && Intrinsics.areEqual(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, byteString);
        if (z2) {
            Intrinsics.checkNotNull(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2, 0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2, 0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        } else if (i > 0) {
            Intrinsics.checkNotNull(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2, 0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        } else {
            ByteString byteString3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(byteString3, "");
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString3, 0L);
            if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
                    byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1);
                } else {
                    byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                }
            }
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(rotationProviderListenerWrapper, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 2) {
                    rotationProviderListenerWrapper2.write(rotationProviderListenerWrapper, 3L);
                } else {
                    rotationProviderListenerWrapper2.write(rotationProviderListenerWrapper, 2L);
                }
            }
        }
        ByteString byteString4 = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean z3 = rotationProviderListenerWrapper2.size > 0;
        ArrayList arrayList = new ArrayList();
        while (rotationProviderListenerWrapper.size != 0) {
            ByteString byteString5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(byteString5, "");
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString5, 0L);
            if (jTuitionPaymentFragmentspecialinlinedviewModeldefault3 != -1) {
                byteStringTuitionPaymentFragmentbindingInflater1 = rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                rotationProviderListenerWrapper.cancel();
            } else {
                byteStringTuitionPaymentFragmentbindingInflater1 = rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size);
            }
            ByteString byteString6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (Intrinsics.areEqual(byteStringTuitionPaymentFragmentbindingInflater1, byteString6)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), byteString6)))) {
                        arrayList.add(byteStringTuitionPaymentFragmentbindingInflater1);
                    } else if (!z2 || arrayList.size() != 1) {
                        CollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(byteStringTuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1) && !Intrinsics.areEqual(byteStringTuitionPaymentFragmentbindingInflater1, ByteString.EMPTY)) {
                arrayList.add(byteStringTuitionPaymentFragmentbindingInflater1);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                Intrinsics.checkNotNullParameter(byteString4, "");
                byteString4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2, 0, byteString4.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
            ByteString byteString7 = (ByteString) arrayList.get(i2);
            Intrinsics.checkNotNullParameter(byteString7, "");
            byteString7.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2, 0, byteString7.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        if (rotationProviderListenerWrapper2.size == 0) {
            ByteString byteString8 = TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullParameter(byteString8, "");
            byteString8.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2, 0, byteString8.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        return new SurfaceViewImplementationExternalSyntheticLambda1(rotationProviderListenerWrapper2.onTransact());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString TuitionPaymentFragmentbindingInflater1(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: ".concat(String.valueOf(str)));
    }

    private static final ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte b2) {
        if (b2 == 47) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: ".concat(String.valueOf((int) b2)));
    }

    private static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(RotationProviderListenerWrapper rotationProviderListenerWrapper, ByteString byteString) {
        if (!Intrinsics.areEqual(byteString, b) || rotationProviderListenerWrapper.size < 2 || rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1L) != 58) {
            return false;
        }
        char cTuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
        if ('a' > cTuitionPaymentFragmentspecialinlinedviewModeldefault3 || cTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= '{') {
            return 'A' <= cTuitionPaymentFragmentspecialinlinedviewModeldefault3 && cTuitionPaymentFragmentspecialinlinedviewModeldefault3 < '[';
        }
        return true;
    }

    public static final /* synthetic */ int TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        int iTuitionPaymentFragmentbindingInflater1 = ByteString.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return iTuitionPaymentFragmentbindingInflater1 != -1 ? iTuitionPaymentFragmentbindingInflater1 : ByteString.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1, b);
    }

    public static final /* synthetic */ boolean b(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        ByteString byteString = surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1;
        ByteString byteString2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNullParameter(byteString2, "");
        if (byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() - byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), byteString2, byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
            return surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == 2 || surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() + (-3), TuitionPaymentFragmentspecialinlinedviewModeldefault2, 1) || surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() + (-3), b, 1);
        }
        return false;
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        if (surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != 0) {
            if (surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.b(0) == 47) {
                return 1;
            }
            if (surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.b(0) == 92) {
                if (surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() <= 2 || surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.b(1) != 92) {
                    return 1;
                }
                ByteString byteString = surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1;
                ByteString byteString2 = b;
                Intrinsics.checkNotNullParameter(byteString2, "");
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2);
                return iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 ? surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() : iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() > 2 && surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.b(1) == 58 && surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.b(2) == 92) {
                char cB = (char) surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.b(0);
                if ('a' <= cB && cB < '{') {
                    return 3;
                }
                if ('A' <= cB && cB < '[') {
                    return 3;
                }
            }
        }
        return -1;
    }

    public static final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2, boolean z) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda2) != -1 || surfaceViewImplementationExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
            return surfaceViewImplementationExternalSyntheticLambda2;
        }
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1);
        if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda2)) == null) {
            byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1);
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        ByteString byteString = surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(byteString, "");
        byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (rotationProviderListenerWrapper.size > 0) {
            Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
            byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        ByteString byteString2 = surfaceViewImplementationExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(byteString2, "");
        byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        ByteString byteString = surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1;
        ByteString byteString2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1;
        ByteString byteString4 = b;
        if (ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteString3, byteString4) != -1) {
            return byteString4;
        }
        return null;
    }
}
