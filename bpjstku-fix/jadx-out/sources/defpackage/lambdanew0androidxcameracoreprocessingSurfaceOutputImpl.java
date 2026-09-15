package defpackage;

import android.view.animation.Animation;
import android.widget.ImageView;
import com.koushikdutta.ion.ScaleMode;

/* JADX INFO: loaded from: classes4.dex */
class lambdanew0androidxcameracoreprocessingSurfaceOutputImpl extends lambdasafeProcess1androidxcameracoreprocessingInternalImageProcessor<ImageView, requestClose> implements getHumanReadableNames {
    public static final lambdanew0androidxcameracoreprocessingSurfaceOutputImpl TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new lambdanew0androidxcameracoreprocessingSurfaceOutputImpl() { // from class: lambdanew0androidxcameracoreprocessingSurfaceOutputImpl.4
        {
            b(new NullPointerException("uri"), (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
        }

        @Override // defpackage.lambdanew0androidxcameracoreprocessingSurfaceOutputImpl, defpackage.lambdasafeProcess1androidxcameracoreprocessingInternalImageProcessor
        public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(requestClose requestclose) throws Exception {
            super.TuitionPaymentFragmentbindingInflater1(requestclose);
        }
    };
    int TuitionPaymentFragmentbindingInflater1;
    private calculateAdditionalTransform.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    Animation TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    ScaleMode b;

    lambdanew0androidxcameracoreprocessingSurfaceOutputImpl() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lambdasafeProcess1androidxcameracoreprocessingInternalImageProcessor
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final void TuitionPaymentFragmentbindingInflater1(requestClose requestclose) throws Exception {
        ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b() == null && imageView != null) {
            if (imageView.getDrawable() != requestclose) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
                return;
            }
            SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = requestclose.asInterface;
            if (surfaceProcessorNodeExternalSyntheticLambda2 != null && surfaceProcessorNodeExternalSyntheticLambda2.b == null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, this.b);
            }
            SurfaceOutputImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(requestclose);
            b((Exception) null, imageView, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
    }

    /* JADX INFO: renamed from: lambdanew0androidxcameracoreprocessingSurfaceOutputImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ScaleMode.values().length];
            b = iArr;
            try {
                iArr[ScaleMode.CenterCrop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ScaleMode.FitCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ScaleMode.CenterInside.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ScaleMode.FitXY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageView imageView, ScaleMode scaleMode) {
        if (scaleMode != null) {
            int i = AnonymousClass1.b[scaleMode.ordinal()];
            if (i == 1) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return;
            }
            if (i == 2) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (i == 3) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                if (i != 4) {
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        }
    }

    public static lambdanew0androidxcameracoreprocessingSurfaceOutputImpl TuitionPaymentFragmentspecialinlinedviewModeldefault3(calculateAdditionalTransform.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, requestClose requestclose) {
        lambdanew0androidxcameracoreprocessingSurfaceOutputImpl lambdanew0androidxcameracoreprocessingsurfaceoutputimpl;
        if (requestclose.g instanceof lambdanew0androidxcameracoreprocessingSurfaceOutputImpl) {
            lambdanew0androidxcameracoreprocessingsurfaceoutputimpl = (lambdanew0androidxcameracoreprocessingSurfaceOutputImpl) requestclose.g;
        } else {
            lambdanew0androidxcameracoreprocessingsurfaceoutputimpl = new lambdanew0androidxcameracoreprocessingSurfaceOutputImpl();
        }
        requestclose.g = lambdanew0androidxcameracoreprocessingsurfaceoutputimpl;
        lambdanew0androidxcameracoreprocessingsurfaceoutputimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
        return lambdanew0androidxcameracoreprocessingsurfaceoutputimpl;
    }
}
