package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).exceptions);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.exceptions = listUnmodifiableList;
        StringBuilder sb = new StringBuilder();
        sb.append(listUnmodifiableList.size());
        sb.append(" exceptions occurred. ");
        this.message = sb.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Throwable th;
        synchronized (this) {
            if (this.cause == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.exceptions.iterator();
                CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        ArrayList<Throwable> arrayList = new ArrayList();
                        Throwable cause = next.getCause();
                        if (cause != null && cause != next) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        for (Throwable th2 : arrayList) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            compositeExceptionCausalChain2.initCause(next);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = compositeExceptionCausalChain2.getCause();
                        if (cause3 != null && compositeExceptionCausalChain2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            compositeExceptionCausalChain2 = cause3;
                        }
                    }
                }
                this.cause = compositeExceptionCausalChain;
            }
            th = this.cause;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentbindingInflater1(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(printWriter));
    }

    private void TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable cause : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            String str = "\t";
            while (true) {
                sb.append(str);
                sb.append(cause);
                sb.append('\n');
                for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                    sb.append("\t\tat ");
                    sb.append(stackTraceElement2);
                    sb.append('\n');
                }
                if (cause.getCause() != null) {
                    sb.append("\tCaused by: ");
                    cause = cause.getCause();
                    str = "";
                }
            }
            i++;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sb.toString());
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj);

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private final PrintStream b;

        TuitionPaymentFragmentbindingInflater1(PrintStream printStream) {
            this.b = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
            this.b.println(obj);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private final PrintWriter TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(PrintWriter printWriter) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.println(obj);
        }
    }

    static final class CompositeExceptionCausalChain extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        CompositeExceptionCausalChain() {
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }
}
