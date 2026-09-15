package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;

/* JADX INFO: loaded from: classes4.dex */
public final class getMatrix implements Html.ImageGetter {
    URI TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    TextView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean b = false;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 50;
    private boolean TuitionPaymentFragmentbindingInflater1 = false;

    public getMatrix(TextView textView) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = textView;
    }

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String str) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        new TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2, this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).execute(str);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends AsyncTask<String, Void, Drawable> {
        private final WeakReference<View> TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final WeakReference<TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final WeakReference<Resources> asBinder;
        private float asInterface;
        private final WeakReference<getMatrix> b;
        private String d;
        private int g;

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Drawable doInBackground(String[] strArr) {
            this.d = strArr[0];
            if (this.asBinder.get() == null) {
                return null;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return TuitionPaymentFragmentbindingInflater1(this.asBinder.get(), this.d);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder.get(), this.d);
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Drawable drawable) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Drawable drawable2 = drawable;
            if (drawable2 == null || (tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get()) == null) {
                return;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.setBounds(0, 0, (int) (drawable2.getIntrinsicWidth() * this.asInterface), (int) (drawable2.getIntrinsicHeight() * this.asInterface));
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = drawable2;
            getMatrix getmatrix = this.b.get();
            if (getmatrix == null) {
                return;
            }
            getmatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invalidate();
            getmatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(getmatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getText());
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, getMatrix getmatrix, View view, boolean z, boolean z2, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            this.g = 50;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new WeakReference<>(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.b = new WeakReference<>(getmatrix);
            this.TuitionPaymentFragmentbindingInflater1 = new WeakReference<>(view);
            this.asBinder = new WeakReference<>(view.getResources());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z2;
            this.g = i;
        }

        private Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault2(Resources resources, String str) {
            try {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, TuitionPaymentFragmentspecialinlinedviewModeldefault2(str));
                View view = this.TuitionPaymentFragmentbindingInflater1.get();
                this.asInterface = (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || view == null) ? 1.0f : view.getWidth() / bitmapDrawable.getIntrinsicWidth();
                bitmapDrawable.setBounds(0, 0, (int) (bitmapDrawable.getIntrinsicWidth() * this.asInterface), (int) (bitmapDrawable.getIntrinsicHeight() * this.asInterface));
                return bitmapDrawable;
            } catch (Exception unused) {
                return null;
            }
        }

        private Drawable TuitionPaymentFragmentbindingInflater1(Resources resources, String str) {
            try {
                InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
                Bitmap bitmap = new BitmapDrawable(resources, inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2).getBitmap();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.g, byteArrayOutputStream);
                bitmap.recycle();
                inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2.close();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                byteArrayOutputStream.close();
                View view = this.TuitionPaymentFragmentbindingInflater1.get();
                this.asInterface = view == null ? 1.0f : view.getWidth() / bitmapDecodeStream.getWidth();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapDecodeStream);
                bitmapDrawable.setBounds(0, 0, (int) (bitmapDrawable.getIntrinsicWidth() * this.asInterface), (int) (bitmapDrawable.getIntrinsicHeight() * this.asInterface));
                return bitmapDrawable;
            } catch (Exception unused) {
                return null;
            }
        }

        private InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws IOException {
            getMatrix getmatrix = this.b.get();
            if (getmatrix == null) {
                return null;
            }
            URI uri = getmatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (InputStream) URI.create(str).toURL().getContent();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends BitmapDrawable {
        protected Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Drawable drawable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }
}
