package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor {
    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
        int i;
        lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessorI_ = null;
        while (!checkreadytorelease.f_() && (lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessorI_ = checkreadytorelease.i_()) != null && (i = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2) > 0) {
            lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessorI_.TuitionPaymentFragmentbindingInflater1(checkreadytorelease, autoValue_Packet);
            if (i == autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessorI_ == checkreadytorelease.i_() && !checkreadytorelease.f_()) {
                System.out.println("handler: ".concat(String.valueOf(lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessorI_)));
                while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
                }
                autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                throw new RuntimeException("mDataHandler failed to consume data, yet remains the mDataHandler.");
            }
        }
        if (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0 || checkreadytorelease.f_()) {
            return;
        }
        System.out.println("handler: ".concat(String.valueOf(lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessorI_)));
        System.out.println("emitter: ".concat(String.valueOf(checkreadytorelease)));
        while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
        }
        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final executeSafely executesafely, byte[] bArr, final lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr.length);
        byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.put(bArr);
        byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.flip();
        final AutoValue_Packet autoValue_Packet = new AutoValue_Packet();
        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor = new lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.3
            @Override // defpackage.lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                executesafely.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet);
                if (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0 || lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor == null) {
                    return;
                }
                executesafely.TuitionPaymentFragmentbindingInflater1(null);
                lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(null);
            }
        };
        executesafely.TuitionPaymentFragmentbindingInflater1(lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor);
        lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T extends getAbsolutePathFromUri, getAbsolutePathFromUri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [T extends getAbsolutePathFromUri, getAbsolutePathFromUri, java.lang.Object] */
    public static <T extends getAbsolutePathFromUri> T TuitionPaymentFragmentbindingInflater1(getAbsolutePathFromUri getabsolutepathfromuri, Class<T> cls) {
        if (cls.isInstance(getabsolutepathfromuri)) {
            return getabsolutepathfromuri;
        }
        while (getabsolutepathfromuri instanceof lambdanew0androidxcameracoreprocessingSurfaceEdgeSettableSurface) {
            getabsolutepathfromuri = (T) ((lambdanew0androidxcameracoreprocessingSurfaceEdgeSettableSurface) getabsolutepathfromuri).cancelAll();
            if (cls.isInstance(getabsolutepathfromuri)) {
                return getabsolutepathfromuri;
            }
        }
        return null;
    }
}
