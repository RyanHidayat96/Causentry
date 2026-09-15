package androidx.FastestIyy;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f265a;
    public StandardIntegrityManager.StandardIntegrityTokenProvider b;

    public O(Context context) {
        this.f265a = context;
    }

    public static void a(final Context context) {
        final O o = new O(context.getApplicationContext());
        a0.a(TypedValues.AttributesType.TYPE_PATH_ROTATE, new b0() { // from class: androidx.FastestIyy.O$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.a(jSONArray.getString(0), (long) jSONArray.getDouble(1));
            }
        });
        a0.a(208, new b0() { // from class: androidx.FastestIyy.O$$ExternalSyntheticLambda4
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return O.a(this.f$0, context, jSONArray);
            }
        });
    }

    public final String a(String str, long j) {
        String str2;
        synchronized (this) {
            final CompletableFuture completableFuture = new CompletableFuture();
            if (this.b == null) {
                IntegrityManagerFactory.createStandard(this.f265a).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(j).build()).addOnSuccessListener(new OnSuccessListener() { // from class: androidx.FastestIyy.O$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        completableFuture.complete((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: androidx.FastestIyy.O$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        completableFuture.completeExceptionally(exc);
                    }
                });
                this.b = (StandardIntegrityManager.StandardIntegrityTokenProvider) completableFuture.get(1L, TimeUnit.MINUTES);
            }
            final CompletableFuture completableFuture2 = new CompletableFuture();
            this.b.request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()).addOnSuccessListener(new OnSuccessListener() { // from class: androidx.FastestIyy.O$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    completableFuture2.complete(((StandardIntegrityManager.StandardIntegrityToken) obj).token());
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.FastestIyy.O$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    completableFuture2.completeExceptionally(exc);
                }
            });
            str2 = (String) completableFuture2.get(1L, TimeUnit.MINUTES);
        }
        return str2;
    }

    public static boolean a(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            Task taskIsVerifyAppsEnabled = SafetyNet.getClient(context).isVerifyAppsEnabled();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            taskIsVerifyAppsEnabled.addOnCompleteListener(new OnCompleteListener() { // from class: androidx.FastestIyy.O$$ExternalSyntheticLambda5
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    O.a(atomicBoolean, task);
                }
            });
            synchronized (atomicBoolean) {
                while (!atomicBoolean.get()) {
                    atomicBoolean.wait();
                }
            }
            return !((SafetyNetApi.VerifyAppsUserResponse) taskIsVerifyAppsEnabled.getResult()).isVerifyAppsEnabled();
        }
        throw new RuntimeException("No apikey");
    }

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, Task task) {
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
            atomicBoolean.notifyAll();
        }
    }

    public static Object a(O o, Context context, JSONArray jSONArray) {
        return Boolean.valueOf(a(context, jSONArray.isNull(0) ? null : jSONArray.optString(0)));
    }
}
