package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
final class getInitializeFuture {
    final Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new HashMap();
    final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    getInitializeFuture() {
    }

    final void TuitionPaymentFragmentbindingInflater1(String str) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (this) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(str);
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 0) {
                    StringBuilder sb = new StringBuilder("Cannot release a lock that is not held, safeKey: ");
                    sb.append(str);
                    sb.append(", interestedThreads: ");
                    sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    throw new IllegalStateException(sb.toString());
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1--;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2Remove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(str);
                    if (!tuitionPaymentFragmentspecialinlinedviewModeldefault2Remove.equals(tuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        StringBuilder sb2 = new StringBuilder("Removed the wrong lock, expected to remove: ");
                        sb2.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        sb2.append(", but actually removed: ");
                        sb2.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2Remove);
                        sb2.append(", safeKey: ");
                        sb2.append(str);
                        throw new IllegalStateException(sb2.toString());
                    }
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() < 10) {
                            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.offer(tuitionPaymentFragmentspecialinlinedviewModeldefault2Remove);
                        }
                    }
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b.unlock();
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Lock b = new ReentrantLock();

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        final Queue<TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayDeque();

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2Poll;
            synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2Poll = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.poll();
            }
            return tuitionPaymentFragmentspecialinlinedviewModeldefault2Poll == null ? new TuitionPaymentFragmentspecialinlinedviewModeldefault2() : tuitionPaymentFragmentspecialinlinedviewModeldefault2Poll;
        }
    }
}
