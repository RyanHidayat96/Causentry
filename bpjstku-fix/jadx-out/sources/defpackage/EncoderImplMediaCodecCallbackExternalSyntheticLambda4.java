package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplMediaCodecCallbackExternalSyntheticLambda4 {
    public static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("NO_THREAD_ELEMENTS");
    private static final Function2<Object, CoroutineContext.Element, Object> TuitionPaymentFragmentbindingInflater1 = new Function2() { // from class: EncoderImplMediaCodecCallbackExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj, (CoroutineContext.Element) obj2);
        }
    };
    private static final Function2<AutoValue_VideoEncoderDataSpace<?>, CoroutineContext.Element, AutoValue_VideoEncoderDataSpace<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Function2() { // from class: EncoderImplMediaCodecCallbackExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return EncoderImplMediaCodecCallbackExternalSyntheticLambda4.b((AutoValue_VideoEncoderDataSpace) obj, (CoroutineContext.Element) obj2);
        }
    };
    private static final Function2<releaseSurface, CoroutineContext.Element, releaseSurface> b = new Function2() { // from class: getMediaFormat
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1((releaseSurface) obj, (CoroutineContext.Element) obj2);
        }
    };

    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, TuitionPaymentFragmentbindingInflater1);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    public static final Object TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineContext);
        }
        if (obj == 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new releaseSurface(coroutineContext, ((Number) obj).intValue()), b);
        }
        Intrinsics.checkNotNull(obj, "");
        return ((AutoValue_VideoEncoderDataSpace) obj).updateThreadContext(coroutineContext);
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineContext coroutineContext, Object obj) {
        if (obj == TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return;
        }
        if (obj instanceof releaseSurface) {
            releaseSurface releasesurface = (releaseSurface) obj;
            int length = releasesurface.b.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                AutoValue_VideoEncoderDataSpace<Object> autoValue_VideoEncoderDataSpace = releasesurface.b[length];
                Intrinsics.checkNotNull(autoValue_VideoEncoderDataSpace);
                autoValue_VideoEncoderDataSpace.restoreThreadContext(coroutineContext, releasesurface.TuitionPaymentFragmentbindingInflater1[length]);
                if (i < 0) {
                    return;
                } else {
                    length = i;
                }
            }
        } else {
            Object objFold = coroutineContext.fold(null, TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Intrinsics.checkNotNull(objFold, "");
            ((AutoValue_VideoEncoderDataSpace) objFold).restoreThreadContext(coroutineContext, obj);
        }
    }

    public static /* synthetic */ AutoValue_VideoEncoderDataSpace b(AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace, CoroutineContext.Element element) {
        if (autoValue_VideoEncoderDataSpace != null) {
            return autoValue_VideoEncoderDataSpace;
        }
        if (element instanceof AutoValue_VideoEncoderDataSpace) {
            return (AutoValue_VideoEncoderDataSpace) element;
        }
        return null;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof AutoValue_VideoEncoderDataSpace)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    public static /* synthetic */ releaseSurface TuitionPaymentFragmentspecialinlinedviewModeldefault1(releaseSurface releasesurface, CoroutineContext.Element element) {
        if (element instanceof AutoValue_VideoEncoderDataSpace) {
            AutoValue_VideoEncoderDataSpace<Object> autoValue_VideoEncoderDataSpace = (AutoValue_VideoEncoderDataSpace) element;
            Object objUpdateThreadContext = autoValue_VideoEncoderDataSpace.updateThreadContext(releasesurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Object[] objArr = releasesurface.TuitionPaymentFragmentbindingInflater1;
            int i = releasesurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            objArr[i] = objUpdateThreadContext;
            AutoValue_VideoEncoderDataSpace<Object>[] autoValue_VideoEncoderDataSpaceArr = releasesurface.b;
            releasesurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
            Intrinsics.checkNotNull(autoValue_VideoEncoderDataSpace, "");
            autoValue_VideoEncoderDataSpaceArr[i] = autoValue_VideoEncoderDataSpace;
        }
        return releasesurface;
    }
}
