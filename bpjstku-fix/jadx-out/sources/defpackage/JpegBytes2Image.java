package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.esafirm.imagepicker.model.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class JpegBytes2Image {
    public ExecutorService TuitionPaymentFragmentbindingInflater1;
    final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {"_id", "_display_name", "_data", "bucket_display_name"};
    Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public JpegBytes2Image(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context.getApplicationContext();
    }

    public class b implements Runnable {
        private ArrayList<File> TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private createImageProxyWithEmptyMetadata TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private boolean asInterface;
        private boolean b;

        public b(boolean z, boolean z2, boolean z3, boolean z4, ArrayList<File> arrayList, createImageProxyWithEmptyMetadata createimageproxywithemptymetadata) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            this.b = z3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z4;
            this.asInterface = z2;
            this.TuitionPaymentFragmentbindingInflater1 = arrayList;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createimageproxywithemptymetadata;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Cursor cursorQuery;
            ArrayList<File> arrayList;
            if (this.asInterface) {
                cursorQuery = JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getContentResolver().query(MediaStore.Files.getContentUri("external"), JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "media_type=3", null, "date_added");
            } else if (this.b) {
                cursorQuery = JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getContentResolver().query(MediaStore.Files.getContentUri("external"), JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "media_type=1 OR media_type=3", null, "date_added");
            } else {
                cursorQuery = JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, "date_added");
            }
            if (cursorQuery == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new NullPointerException());
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            HashMap map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? new HashMap() : null;
            if (cursorQuery.moveToLast()) {
                do {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[2]));
                    File fileTuitionPaymentFragmentbindingInflater1 = JpegBytes2Image.TuitionPaymentFragmentbindingInflater1(string);
                    if (fileTuitionPaymentFragmentbindingInflater1 != null && (((arrayList = this.TuitionPaymentFragmentbindingInflater1) == null || !arrayList.contains(fileTuitionPaymentFragmentbindingInflater1)) && (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 || !createPacket.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string).equalsIgnoreCase("gif")))) {
                        long j = cursorQuery.getLong(cursorQuery.getColumnIndex(JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]));
                        String string3 = cursorQuery.getString(cursorQuery.getColumnIndex(JpegBytes2Image.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[3]));
                        Image image = new Image(j, string2, string);
                        arrayList2.add(image);
                        if (map != null) {
                            lambdaprocessInputPacket5 lambdaprocessinputpacket5 = (lambdaprocessInputPacket5) map.get(string3);
                            if (lambdaprocessinputpacket5 == null) {
                                lambdaprocessinputpacket5 = new lambdaprocessInputPacket5(string3);
                                map.put(string3, lambdaprocessinputpacket5);
                            }
                            lambdaprocessinputpacket5.b().add(image);
                        }
                    }
                } while (cursorQuery.moveToPrevious());
            }
            cursorQuery.close();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList2, map != null ? new ArrayList(map.values()) : null);
        }
    }

    static File TuitionPaymentFragmentbindingInflater1(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new File(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        UseCaseAttachStateExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1[0] = updateUseCase.b[0];
    }
}
