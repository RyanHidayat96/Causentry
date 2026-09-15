package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class acquireBuffer implements BufferProviderState, hasMatchedVideoProfileForDynamicRange {
    private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private isRedmi6A<BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            isRedmi6A<BufferProviderState> isredmi6a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(isredmi6a);
        }
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.hasMatchedVideoProfileForDynamicRange
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(BufferProviderState bufferProviderState) {
        share.b(bufferProviderState, "disposable is null");
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            synchronized (this) {
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    isRedmi6A<BufferProviderState> isredmi6a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (isredmi6a == null) {
                        isredmi6a = new isRedmi6A<>();
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isredmi6a;
                    }
                    isredmi6a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderState);
                    return true;
                }
            }
        }
        bufferProviderState.dispose();
        return false;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(BufferProviderState... bufferProviderStateArr) {
        share.b(bufferProviderStateArr, "disposables is null");
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            synchronized (this) {
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    isRedmi6A<BufferProviderState> isredmi6a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (isredmi6a == null) {
                        int length = bufferProviderStateArr.length;
                        isredmi6a = new isRedmi6A<>(5);
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isredmi6a;
                    }
                    int length2 = bufferProviderStateArr.length;
                    for (int i = 0; i < 4; i++) {
                        BufferProviderState bufferProviderState = bufferProviderStateArr[i];
                        share.b(bufferProviderState, "A Disposable in the disposables array is null");
                        isredmi6a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderState);
                    }
                    return true;
                }
            }
        }
        int length3 = bufferProviderStateArr.length;
        for (int i2 = 0; i2 < 4; i2++) {
            bufferProviderStateArr[i2].dispose();
        }
        return false;
    }

    @Override // defpackage.hasMatchedVideoProfileForDynamicRange
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(BufferProviderState bufferProviderState) {
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2(bufferProviderState)) {
            return false;
        }
        bufferProviderState.dispose();
        return true;
    }

    @Override // defpackage.hasMatchedVideoProfileForDynamicRange
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(BufferProviderState bufferProviderState) {
        BufferProviderState bufferProviderState2;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        share.b(bufferProviderState, "disposables is null");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return false;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return false;
            }
            isRedmi6A<BufferProviderState> isredmi6a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (isredmi6a != null) {
                BufferProviderState[] bufferProviderStateArr = isredmi6a.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i = isredmi6a.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int iHashCode = bufferProviderState.hashCode() * (-1640531527);
                int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                BufferProviderState bufferProviderState3 = bufferProviderStateArr[i2];
                if (bufferProviderState3 != null) {
                    if (bufferProviderState3.equals(bufferProviderState)) {
                        zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isredmi6a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, bufferProviderStateArr, i);
                    } else {
                        do {
                            i2 = (i2 + 1) & i;
                            bufferProviderState2 = bufferProviderStateArr[i2];
                            if (bufferProviderState2 == null) {
                            }
                        } while (!bufferProviderState2.equals(bufferProviderState));
                        zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isredmi6a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, bufferProviderStateArr, i);
                    }
                    if (zTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            isRedmi6A<BufferProviderState> isredmi6a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(isredmi6a);
        }
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return 0;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return 0;
            }
            isRedmi6A<BufferProviderState> isredmi6a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return isredmi6a != null ? isredmi6a.TuitionPaymentFragmentbindingInflater1 : 0;
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isRedmi6A<BufferProviderState> isredmi6a) {
        if (isredmi6a != null) {
            ArrayList arrayList = null;
            for (BufferProviderState bufferProviderState : isredmi6a.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (bufferProviderState instanceof BufferProviderState) {
                    try {
                        bufferProviderState.dispose();
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) arrayList.get(0));
                }
                throw new CompositeException(arrayList);
            }
        }
    }
}
