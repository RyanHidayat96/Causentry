package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LnotifyStateDetached;", "", "<init>", "()V", ExifInterface.LATITUDE_SOUTH, "Ljava/lang/Class;", "p0", "Lokhttp3/OkHttpClient;", "p1", "", "p2", "b", "(Ljava/lang/Class;Lokhttp3/OkHttpClient;Ljava/lang/String;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0})
public final class notifyStateDetached {
    public static final notifyStateDetached INSTANCE = new notifyStateDetached();

    private notifyStateDetached() {
    }

    public static <S> S b(Class<S> p0, OkHttpClient p1, String p2) {
        new GsonBuilder().create();
        return (S) new Retrofit.Builder().baseUrl(p2).client(p1).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build().create(p0);
    }
}
