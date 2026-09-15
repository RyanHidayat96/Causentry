package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class getAutoCancelDurationInMillis extends ExperimentalGetImage<isAutoCancelEnabled> {
    public getAutoCancelDurationInMillis(isAutoCancelEnabled isautocancelenabled) {
        super(isautocancelenabled);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class<isAutoCancelEnabled> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return isAutoCancelEnabled.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        setAutoCancelDuration setautocancelduration = ((isAutoCancelEnabled) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return setautocancelduration.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3() + setautocancelduration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ((isAutoCancelEnabled) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).stop();
        isAutoCancelEnabled isautocancelenabled = (isAutoCancelEnabled) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        isautocancelenabled.b = true;
        setAutoCancelDuration setautocancelduration = isautocancelenabled.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        setautocancelduration.b.clear();
        Bitmap bitmap = setautocancelduration.TuitionPaymentFragmentbindingInflater1;
        if (bitmap != null) {
            setautocancelduration.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(bitmap);
            setautocancelduration.TuitionPaymentFragmentbindingInflater1 = null;
        }
        setautocancelduration.asInterface = false;
        setAutoCancelDuration.b bVar = setautocancelduration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (bVar != null) {
            setautocancelduration.onTransact.b(bVar);
            setautocancelduration.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        setAutoCancelDuration.b bVar2 = setautocancelduration.f1359a;
        if (bVar2 != null) {
            setautocancelduration.onTransact.b(bVar2);
            setautocancelduration.f1359a = null;
        }
        setAutoCancelDuration.b bVar3 = setautocancelduration.INotificationSideChannel;
        if (bVar3 != null) {
            setautocancelduration.onTransact.b(bVar3);
            setautocancelduration.INotificationSideChannel = null;
        }
        setautocancelduration.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        setautocancelduration.d = true;
    }

    @Override // defpackage.ExperimentalGetImage, defpackage.requireLensFacing
    public final void b() {
        ((isAutoCancelEnabled) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.prepareToDraw();
    }
}
