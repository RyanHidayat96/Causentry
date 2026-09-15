package defpackage;

import com.google.android.gms.stats.CodePackage;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class getTransformMatrix {
    private static final HashMap<String, b> b = new HashMap<>();
    private static final HashMap<String, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap<>();
    private static final HashMap<String, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new HashMap<>();
    private static final HashMap<String, Integer> asBinder = new HashMap<>();
    private static final HashMap<Integer, String> TuitionPaymentFragmentbindingInflater1 = new HashMap<>();
    private static final HashMap<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap<>();

    public static boolean TuitionPaymentFragmentbindingInflater1(int i) {
        if (i < 21 || i > 31) {
            return i >= 200 && i <= 200;
        }
        return true;
    }

    public static class b {
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        b(int i, String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("MP3", 1, "audio/mpeg", 12297);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("MPGA", 1, "audio/mpeg", 12297);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("M4A", 2, "audio/mp4", 12299);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("WAV", 3, "audio/x-wav", 12296);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("WAV", 15, "audio/wav");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("AMR", 4, "audio/amr");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("AWB", 5, "audio/amr-wb");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("DIVX", 31, "video/divx");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("QCP", 13, "audio/qcelp");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("OGG", 7, "audio/ogg", 47362);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("OGG", 7, "application/ogg", 47362);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("OGA", 7, "audio/ogg", 47362);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("OGA", 7, "application/ogg", 47362);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("AAC", 8, "audio/aac", 47363);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("AAC", 8, "audio/aac-adts", 47363);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("MKA", 9, "audio/x-matroska");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("MID", 17, "audio/midi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("MIDI", 17, "audio/midi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("XMF", 17, "audio/midi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("RTTTL", 17, "audio/midi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("SMF", 18, "audio/sp-midi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("IMY", 19, "audio/imelody");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("RTX", 17, "audio/midi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(CodePackage.OTA, 17, "audio/midi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("MXMF", 17, "audio/midi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("MPEG", 21, "video/mpeg", 12299);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("MPG", 21, "video/mpeg", 12299);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("MP4", 21, "video/mp4", 12299);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("MPEG4", 21, "video/mpeg4", 12299);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("M4V", 22, "video/m4v", 12299);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("3GP", 23, "video/3gpp", 47492);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("3GPP", 23, "video/3gpp", 47492);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("3G2", 24, "video/3gpp2", 47492);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("3GPP2", 24, "video/3gpp2", 47492);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("MKV", 27, "video/x-matroska");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("WEBM", 30, "video/webm");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("TS", 28, "video/mp2ts");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("MPG", 28, "video/mp2ts");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("AVI", 29, "video/avi");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("JPG", 32, "image/jpeg", 14337);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("JPEG", 32, "image/jpeg", 14337);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("GIF", 33, "image/gif", 14343);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("PNG", 34, "image/png", 14347);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("BMP", 35, "image/x-ms-bmp", 14340);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("WBMP", 36, "image/vnd.wap.wbmp");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("WEBP", 37, "image/webp");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("M3U", 41, "audio/x-mpegurl", 47633);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("M3U", 41, "application/x-mpegurl", 47633);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("PLS", 42, "audio/x-scpls", 47636);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("WPL", 43, "application/vnd.ms-wpl", 47632);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("M3U8", 44, "application/vnd.apple.mpegurl");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("M3U8", 44, "audio/mpegurl");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("M3U8", 44, "audio/x-mpegurl");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("FL", 51, "application/x-android-drm-fl");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("TXT", 100, "text/plain", 12292);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("HTM", 101, "text/html", 12293);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("HTML", 101, "text/html", 12293);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("PDF", 102, "application/pdf");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("DOC", 104, "application/msword", 47747);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("XLS", 105, "application/vnd.ms-excel", 47749);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("PPT", 106, "application/mspowerpoint", 47750);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("FLAC", 10, "audio/flac", 47366);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("ZIP", 107, "application/zip");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("MPG", 200, "video/mp2p");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("MPEG", 200, "video/mp2p");
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, int i, String str2) {
        b.put(str, new b(i, str2));
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(str2, Integer.valueOf(i));
        TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(str2, str);
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, int i, String str2, int i2) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, i, str2);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(str, Integer.valueOf(i2));
        asBinder.put(str2, Integer.valueOf(i2));
        TuitionPaymentFragmentbindingInflater1.put(Integer.valueOf(i2), str2);
    }

    public static b TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return null;
        }
        return b.get(str.substring(iLastIndexOf + 1).toUpperCase(Locale.ROOT));
    }
}
