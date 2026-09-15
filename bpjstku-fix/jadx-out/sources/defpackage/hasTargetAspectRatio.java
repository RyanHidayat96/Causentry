package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class hasTargetAspectRatio implements ImageOutputConfigRotationValue {
    @Override // defpackage.ImageOutputConfigRotationValue
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d < lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
            sb.append(lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.charAt(lambdaaddobserver2androidxcameracoreimpllivedataobservable.d));
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.d++;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = LiveDataObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaaddobserver2androidxcameracoreimpllivedataobservable.b, lambdaaddobserver2androidxcameracoreimpllivedataobservable.d, 5);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 5) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                break;
            }
        }
        int length = sb.length() - 1;
        int length2 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length() + length + 1;
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.b(length2);
        boolean z = lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - length2 > 0;
        if (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d < lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + 249));
                sb.insert(1, (char) (length % ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length3 = sb.length();
        for (int i = 0; i < length3; i++) {
            int iCharAt = sb.charAt(i) + (((lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length() + 1) * 149) % 255) + 1;
            if (iCharAt > 255) {
                iCharAt -= 256;
            }
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) iCharAt);
        }
    }
}
