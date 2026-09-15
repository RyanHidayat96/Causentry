package defpackage;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.koushikdutta.ion.ResponseServedFrom;
import com.koushikdutta.ion.ScaleMode;
import com.koushikdutta.ion.builder.AnimateGifMode;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceProcessorNode extends SurfaceOutputImplExternalSyntheticLambda0 implements getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    private calculateAdditionalTransform.TuitionPaymentFragmentbindingInflater1 INotificationSideChannel;
    private int INotificationSideChannelDefault;
    private Drawable INotificationSideChannelStub;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f226a;
    private canSetProvider asBinder;
    private int cancel;
    private boolean cancelAll;
    private int d;
    private Drawable g;
    private int getInterfaceDescriptor;
    private Animation notify;
    private Animation onTransact;

    @Override // defpackage.SurfaceOutputImplExternalSyntheticLambda0
    public final /* bridge */ /* synthetic */ String b(String str) {
        return super.b(str);
    }

    public SurfaceProcessorNode(calculateInvertedTextureTransform calculateinvertedtexturetransform) {
        super(calculateinvertedtexturetransform);
        this.cancelAll = true;
        this.asBinder = canSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.SurfaceOutputImplExternalSyntheticLambda0
    final void TuitionPaymentFragmentbindingInflater1() {
        super.TuitionPaymentFragmentbindingInflater1();
        this.cancelAll = true;
        this.f226a = false;
        this.INotificationSideChannel = null;
        this.INotificationSideChannelStub = null;
        this.asBinder = canSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.getInterfaceDescriptor = 0;
        this.g = null;
        this.d = 0;
        this.notify = null;
        this.cancel = 0;
        this.onTransact = null;
        this.INotificationSideChannelDefault = 0;
    }

    final SurfaceProcessorNode TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageView imageView) {
        calculateAdditionalTransform.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.INotificationSideChannel;
        if (tuitionPaymentFragmentbindingInflater1 != null && tuitionPaymentFragmentbindingInflater1.get() == imageView) {
            return this;
        }
        this.INotificationSideChannel = new calculateAdditionalTransform.TuitionPaymentFragmentbindingInflater1(imageView);
        return this;
    }

    private requestClose TuitionPaymentFragmentbindingInflater1(ImageView imageView, SurfaceOutputImpl surfaceOutputImpl, ResponseServedFrom responseServedFrom) {
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = surfaceOutputImpl != null ? surfaceOutputImpl.d : null;
        if (surfaceProcessorNodeExternalSyntheticLambda2 != null) {
            surfaceOutputImpl = null;
        }
        requestClose requestcloseTuitionPaymentFragmentbindingInflater1 = requestClose.TuitionPaymentFragmentbindingInflater1(imageView);
        calculateInvertedTextureTransform calculateinvertedtexturetransform = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (calculateinvertedtexturetransform == null) {
            throw new AssertionError("null ion");
        }
        requestcloseTuitionPaymentFragmentbindingInflater1.asBinder = calculateinvertedtexturetransform;
        requestClose requestcloseTuitionPaymentFragmentbindingInflater2 = requestcloseTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(surfaceProcessorNodeExternalSyntheticLambda2, responseServedFrom);
        requestcloseTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1 = surfaceOutputImpl;
        if (requestcloseTuitionPaymentFragmentbindingInflater2.asBinder == null) {
            throw new AssertionError("null ion");
        }
        requestcloseTuitionPaymentFragmentbindingInflater2.INotificationSideChannel = this.b == AnimateGifMode.ANIMATE;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        int i3 = requestcloseTuitionPaymentFragmentbindingInflater2.notify;
        int i4 = requestcloseTuitionPaymentFragmentbindingInflater2.onTransact;
        requestcloseTuitionPaymentFragmentbindingInflater2.b = 0;
        requestcloseTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        requestcloseTuitionPaymentFragmentbindingInflater2.cancel = 0;
        requestcloseTuitionPaymentFragmentbindingInflater2.f1345a = null;
        requestcloseTuitionPaymentFragmentbindingInflater2.d = this.cancelAll;
        requestcloseTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asBinder;
        requestClose requestcloseTuitionPaymentFragmentspecialinlinedviewModeldefault1 = requestcloseTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        imageView.setImageDrawable(requestcloseTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return requestcloseTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.TargetUtils
    public final getHumanReadableNames TuitionPaymentFragmentbindingInflater1(String str) {
        lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl anonymousClass3;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            Context applicationContext = this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1().getApplicationContext();
            if (applicationContext instanceof Service) {
                anonymousClass3 = new calculateAdditionalTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Service) applicationContext);
            } else if (applicationContext instanceof Activity) {
                anonymousClass3 = new calculateAdditionalTransform.b((Activity) applicationContext);
            } else {
                anonymousClass3 = new calculateAdditionalTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2<Context>(applicationContext) { // from class: calculateAdditionalTransform.3
                    AnonymousClass3(Context applicationContext2) {
                        super(applicationContext2);
                    }

                    @Override // defpackage.lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl
                    public final String b() {
                        if (((Context) get()) == null) {
                            return "Context reference null";
                        }
                        return null;
                    }
                };
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new lambdasetUpRotationUpdates1(anonymousClass3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        lambdasetUpRotationUpdates1 lambdasetuprotationupdates1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        ImageView imageView = this.INotificationSideChannel.get();
        if (imageView == null) {
            throw new NullPointerException("imageView");
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onTransact == null) {
            requestClose requestcloseTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(imageView, null, ResponseServedFrom.LOADED_FROM_NETWORK);
            requestcloseTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, null);
            requestcloseTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = null;
            return lambdanew0androidxcameracoreprocessingSurfaceOutputImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView);
        int measuredWidth = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int measuredHeight = this.TuitionPaymentFragmentbindingInflater1;
        int i = this.TuitionPaymentFragmentbindingInflater1;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (!imageView.getAdjustViewBounds()) {
            measuredWidth = imageView.getMeasuredWidth();
            measuredHeight = imageView.getMeasuredHeight();
        }
        SurfaceOutputImpl surfaceOutputImplB = b(measuredWidth, measuredHeight);
        if (surfaceOutputImplB.d != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView, null, 0);
            requestClose requestcloseTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(imageView, surfaceOutputImplB, ResponseServedFrom.LOADED_FROM_MEMORY);
            requestcloseTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, null);
            requestcloseTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1 = null;
            lambdanew0androidxcameracoreprocessingSurfaceOutputImpl lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew0androidxcameracoreprocessingSurfaceOutputImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannel, requestcloseTuitionPaymentFragmentbindingInflater2);
            lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = 0;
            ScaleMode scaleMode = this.asInterface;
            lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b = null;
            lambdanew0androidxcameracoreprocessingSurfaceOutputImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, this.asInterface);
            lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface();
            lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(surfaceOutputImplB.d.b, imageView, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
            return lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        requestClose requestcloseTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(imageView, surfaceOutputImplB, ResponseServedFrom.LOADED_FROM_NETWORK);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView, this.onTransact, this.INotificationSideChannelDefault);
        lambdanew0androidxcameracoreprocessingSurfaceOutputImpl lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault4 = lambdanew0androidxcameracoreprocessingSurfaceOutputImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannel, requestcloseTuitionPaymentFragmentbindingInflater3);
        lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1 = 0;
        ScaleMode scaleMode2 = this.asInterface;
        lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault4.b = null;
        lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault4.asInterface();
        return lambdanew0androidxcameracoreprocessingsurfaceoutputimplTuitionPaymentFragmentspecialinlinedviewModeldefault4;
    }
}
