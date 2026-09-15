package defpackage;

import android.os.Looper;
import com.koushikdutta.async.util.ArrayDeque;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
public class AutoValue_Packet {
    private static PriorityQueue<ByteBuffer> asInterface = new PriorityQueue<>(8, new TuitionPaymentFragmentbindingInflater1());
    private static int g = 1048576;
    public static int TuitionPaymentFragmentbindingInflater1 = 262144;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f81a = 0;
    private static final Object asBinder = new Object();
    public static final ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteBuffer.allocate(0);
    public ArrayDeque<ByteBuffer> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayDeque<>();
    ByteOrder b = ByteOrder.BIG_ENDIAN;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    public final ByteBuffer[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ByteBuffer[] byteBufferArr = (ByteBuffer[]) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toArray(new ByteBuffer[this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size()]);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        return byteBufferArr;
    }

    public final AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBuffer);
            return this;
        }
        int iRemaining = byteBuffer.remaining();
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i >= 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + iRemaining;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
            ByteBuffer byteBufferB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
            if (byteBufferB.capacity() - byteBufferB.limit() >= byteBuffer.remaining()) {
                byteBufferB.mark();
                byteBufferB.position(byteBufferB.limit());
                byteBufferB.limit(byteBufferB.capacity());
                byteBufferB.put(byteBuffer);
                byteBufferB.limit(byteBufferB.position());
                byteBufferB.reset();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBuffer);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
                return this;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(byteBuffer);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        return this;
    }

    public final void TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBuffer);
            return;
        }
        int iRemaining = byteBuffer.remaining();
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i >= 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + iRemaining;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
            ArrayDeque<ByteBuffer> arrayDeque = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = arrayDeque.b[arrayDeque.TuitionPaymentFragmentspecialinlinedviewModeldefault2];
            if (obj != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                if (byteBuffer2.position() >= byteBuffer.remaining()) {
                    byteBuffer2.position(byteBuffer2.position() - byteBuffer.remaining());
                    byteBuffer2.mark();
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.reset();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBuffer);
                    return;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBuffer);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        while (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    }

    static class TuitionPaymentFragmentbindingInflater1 implements Comparator<ByteBuffer> {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            ByteBuffer byteBuffer3 = byteBuffer;
            ByteBuffer byteBuffer4 = byteBuffer2;
            if (byteBuffer3.capacity() == byteBuffer4.capacity()) {
                return 0;
            }
            return byteBuffer3.capacity() > byteBuffer4.capacity() ? 1 : -1;
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.isDirect() || byteBuffer.arrayOffset() != 0 || byteBuffer.array().length != byteBuffer.capacity() || byteBuffer.capacity() < 8192 || byteBuffer.capacity() > TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        PriorityQueue<ByteBuffer> priorityQueue = (mainLooper == null || Thread.currentThread() != mainLooper.getThread()) ? asInterface : null;
        if (priorityQueue != null) {
            synchronized (asBinder) {
                while (d > g && priorityQueue.size() > 0 && priorityQueue.peek().capacity() < byteBuffer.capacity()) {
                    d -= priorityQueue.remove().capacity();
                }
                if (d > g) {
                    return;
                }
                byteBuffer.position(0);
                byteBuffer.limit(byteBuffer.capacity());
                d += byteBuffer.capacity();
                priorityQueue.add(byteBuffer);
                f81a = Math.max(f81a, byteBuffer.capacity());
            }
        }
    }

    public static ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        ByteBuffer byteBufferRemove;
        if (i <= f81a) {
            Looper mainLooper = Looper.getMainLooper();
            PriorityQueue<ByteBuffer> priorityQueue = (mainLooper == null || Thread.currentThread() != mainLooper.getThread()) ? asInterface : null;
            if (priorityQueue != null) {
                synchronized (asBinder) {
                    do {
                        if (priorityQueue.size() > 0) {
                            byteBufferRemove = priorityQueue.remove();
                            if (priorityQueue.size() == 0) {
                                f81a = 0;
                            }
                            d -= byteBufferRemove.capacity();
                        }
                    } while (byteBufferRemove.capacity() < i);
                    return byteBufferRemove;
                }
            }
        }
        return ByteBuffer.allocate(Math.max(8192, i));
    }

    public static void TuitionPaymentFragmentbindingInflater1(OutputStream outputStream, ByteBuffer byteBuffer) throws IOException {
        byte[] bArrArray;
        int iRemaining;
        int i;
        if (byteBuffer.isDirect()) {
            bArrArray = new byte[byteBuffer.remaining()];
            iRemaining = byteBuffer.remaining();
            byteBuffer.get(bArrArray);
            i = 0;
        } else {
            bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            iRemaining = byteBuffer.remaining();
            i = iArrayOffset;
        }
        outputStream.write(bArrArray, i, iRemaining);
    }

    public final ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        ByteBuffer byteBufferRemove;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < i) {
            StringBuilder sb = new StringBuilder("count : ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append("/");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        ByteBuffer byteBufferPeek = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.peek();
        while (byteBufferPeek != null && !byteBufferPeek.hasRemaining()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
            byteBufferPeek = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.peek();
        }
        if (byteBufferPeek == null) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if (byteBufferPeek.remaining() >= i) {
            return byteBufferPeek.order(this.b);
        }
        ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit(i);
        byte[] bArrArray = byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.array();
        int i2 = 0;
        loop1: while (true) {
            byteBufferRemove = null;
            do {
                if (i2 >= i) {
                    break loop1;
                }
                byteBufferRemove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                int iMin = Math.min(i - i2, byteBufferRemove.remaining());
                byteBufferRemove.get(bArrArray, i2, iMin);
                i2 += iMin;
            } while (byteBufferRemove.remaining() != 0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferRemove);
        }
        if (byteBufferRemove != null && byteBufferRemove.remaining() > 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBufferRemove);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.order(this.b);
    }

    public final void TuitionPaymentFragmentbindingInflater1(AutoValue_Packet autoValue_Packet, int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < i) {
            throw new IllegalArgumentException("length");
        }
        int i2 = 0;
        while (i2 < i) {
            ByteBuffer byteBufferRemove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
            int iRemaining = byteBufferRemove.remaining();
            if (iRemaining == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferRemove);
            } else {
                int i3 = iRemaining + i2;
                if (i3 > i) {
                    int i4 = i - i2;
                    ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(i4);
                    byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit(i4);
                    byteBufferRemove.get(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.array(), 0, i4);
                    autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBufferRemove);
                    break;
                }
                autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferRemove);
                i2 = i3;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= i;
    }
}
