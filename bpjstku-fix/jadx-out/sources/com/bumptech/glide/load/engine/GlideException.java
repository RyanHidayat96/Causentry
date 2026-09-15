package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import defpackage.getCameraControl;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GlideException extends Exception {
    private static final StackTraceElement[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    Class<?> dataClass;
    DataSource dataSource;
    private String detailMessage;
    public Exception exception;
    getCameraControl key;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.causes = list;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            Iterator<Throwable> it = ((GlideException) th).causes.iterator();
            while (it.hasNext()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String string3 = "";
        if (this.dataClass != null) {
            StringBuilder sb2 = new StringBuilder(", ");
            sb2.append(this.dataClass);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        if (this.dataSource != null) {
            StringBuilder sb3 = new StringBuilder(", ");
            sb3.append(this.dataSource);
            string2 = sb3.toString();
        } else {
            string2 = "";
        }
        sb.append(string2);
        if (this.key != null) {
            StringBuilder sb4 = new StringBuilder(", ");
            sb4.append(this.key);
            string3 = sb4.toString();
        }
        sb.append(string3);
        ArrayList arrayList = new ArrayList();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements Appendable {
        private final Appendable TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

        TuitionPaymentFragmentbindingInflater1(Appendable appendable) {
            this.TuitionPaymentFragmentbindingInflater1 = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                this.TuitionPaymentFragmentbindingInflater1.append("  ");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = c == '\n';
            this.TuitionPaymentFragmentbindingInflater1.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            return append(charSequence, 0, charSequence.length());
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                this.TuitionPaymentFragmentbindingInflater1.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
            this.TuitionPaymentFragmentbindingInflater1.append(charSequence, i, i2);
            return this;
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<Throwable> list, Appendable appendable) {
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
                Throwable th = list.get(i);
                if (th instanceof GlideException) {
                    GlideException glideException = (GlideException) th;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(glideException, appendable);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(glideException.causes, new TuitionPaymentFragmentbindingInflater1(appendable));
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appendable);
                }
                i = i2;
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, printStream);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.causes, new TuitionPaymentFragmentbindingInflater1(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, printWriter);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.causes, new TuitionPaymentFragmentbindingInflater1(printWriter));
    }
}
