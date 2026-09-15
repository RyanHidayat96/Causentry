package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static final Clock zaa;
    final int zab;
    final List zac;
    private final String zad;
    private final String zae;
    private final String zaf;
    private final String zag;
    private final Uri zah;
    private String zai;
    private final long zaj;
    private final String zak;
    private final String zal;
    private final String zam;
    private final Set zan = new HashSet();
    private static final byte[] $$d = {19, 78, 114, 113, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -28, 13, -14, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 97;
    private static final byte[] $$a = {27, -8, 5, 78, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 21;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        CREATOR = new zab();
        zaa = DefaultClock.getInstance();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.zab = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r6 = r6 + r8
            int r6 = r6 + (-10)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInAccount.a(int, int, short, java.lang.Object[]):void");
    }

    public static GoogleSignInAccount createDefault() {
        int i = 2 % 2;
        GoogleSignInAccount googleSignInAccountZae = zae(new Account("<<default account>>", "com.google"), new HashSet());
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return googleSignInAccountZae;
    }

    private static void d(short s, short s2, short s3, Object[] objArr) {
        int i = 99 - (s * 15);
        byte[] bArr = $$d;
        int i2 = s2 * 3;
        int i3 = s3 + 4;
        byte[] bArr2 = new byte[53 - i2];
        int i4 = 52 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = i3 + i + 3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            i = i + bArr[i7] + 3;
            i3 = i7;
            i5 = i6;
        }
    }

    public static GoogleSignInAccount fromAccount(Account account) {
        int i = 2 % 2;
        GoogleSignInAccount googleSignInAccountZae = zae(account, new ArraySet());
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        b = i2 % 128;
        int i3 = i2 % 2;
        return googleSignInAccountZae;
    }

    private static GoogleSignInAccount zae(Account account, Set set) {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        GoogleSignInAccount googleSignInAccountZaa = zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
        int i4 = b + 53;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return googleSignInAccountZaa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r2 = new android.accounts.Account(r1, "com.google");
        r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.TuitionPaymentFragmentbindingInflater1 + 43;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 1;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount.b = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.accounts.Account getAccount() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.b
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.google.android.gms.auth.api.signin.GoogleSignInAccount.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            java.lang.String r1 = r4.zaf
            r3 = 45
            int r3 = r3 / 0
            if (r1 != 0) goto L2a
            goto L1b
        L17:
            java.lang.String r1 = r4.zaf
            if (r1 != 0) goto L2a
        L1b:
            int r2 = r2 + 1
            int r1 = r2 % 128
            com.google.android.gms.auth.api.signin.GoogleSignInAccount.b = r1
            int r2 = r2 % r0
            r0 = 0
            if (r2 != 0) goto L29
            r1 = 56
            int r1 = r1 / 0
        L29:
            return r0
        L2a:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r3 = "com.google"
            r2.<init>(r1, r3)
            int r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 43
            int r3 = r1 % 128
            com.google.android.gms.auth.api.signin.GoogleSignInAccount.b = r3
            int r1 = r1 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInAccount.getAccount():android.accounts.Account");
    }

    public Set<Scope> getGrantedScopes() {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(this.zac);
        int i2 = b + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return hashSet;
    }

    public boolean isExpired() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            if (zaa.currentTimeMillis() / 1000 >= (this.zaj | 300)) {
                return true;
            }
        } else if (zaa.currentTimeMillis() / 1000 >= this.zaj - 300) {
            return true;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 109;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return false;
    }

    public GoogleSignInAccount requestExtraScopes(Scope... scopeArr) {
        int i = 2 % 2;
        if (scopeArr != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
            b = i2 % 128;
            int i3 = i2 % 2;
            Collections.addAll(this.zan, scopeArr);
        }
        int i4 = b + 91;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public Set<Scope> getRequestedScopes() {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(this.zac);
        hashSet.addAll(this.zan);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        return hashSet;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = ((this.zak.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
        int i4 = b + 93;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return iHashCode;
    }

    public static GoogleSignInAccount zaa(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        int i = 2 % 2;
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        return googleSignInAccount;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            int i2 = b + 75;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (obj == this) {
            int i4 = b + 101;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.zak.equals(this.zak)) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 61;
            b = i6 % 128;
            int i7 = i6 % 2;
            if (googleSignInAccount.getRequestedScopes().equals(getRequestedScopes())) {
                return true;
            }
        }
        return false;
    }

    public static GoogleSignInAccount fromAccountAndScopes(Account account, Scope scope, Scope... scopeArr) {
        int i = 2 % 2;
        Preconditions.checkNotNull(account);
        Preconditions.checkNotNull(scope);
        HashSet hashSet = new HashSet();
        hashSet.add(scope);
        hashSet.addAll(Arrays.asList(scopeArr));
        GoogleSignInAccount googleSignInAccountZae = zae(account, hashSet);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        return googleSignInAccountZae;
    }

    public static GoogleSignInAccount zab(String str) throws JSONException {
        String strOptString;
        String strOptString2;
        String strOptString3;
        int i = 2 % 2;
        String strOptString4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString5 = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString5) ? Uri.parse(strOptString5) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            hashSet.add(new Scope(jSONArray.getString(i4)));
            i4++;
            int i5 = b + 115;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        }
        String strOptString6 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 75;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                jSONObject.optString("tokenId");
                throw null;
            }
            strOptString = jSONObject.optString("tokenId");
        } else {
            strOptString = null;
        }
        if (jSONObject.has("email")) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 5;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                jSONObject.optString("email");
                throw null;
            }
            strOptString2 = jSONObject.optString("email");
        } else {
            strOptString2 = null;
        }
        if (jSONObject.has("displayName")) {
            int i9 = b + 121;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            if (i9 % 2 != 0) {
                jSONObject.optString("displayName");
                throw null;
            }
            strOptString3 = jSONObject.optString("displayName");
        } else {
            strOptString3 = null;
        }
        GoogleSignInAccount googleSignInAccountZaa = zaa(strOptString6, strOptString, strOptString2, strOptString3, !(jSONObject.has("givenName") ^ true) ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            int i10 = b + 3;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            strOptString4 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccountZaa.zai = strOptString4;
        return googleSignInAccountZaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 87;
        b = i3 % 128;
        int i4 = i3 % 2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zab);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zaj);
        SafeParcelWriter.writeString(parcel, 9, this.zak, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zac, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        int i5 = b + 53;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String zad() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                int i2 = b + 11;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                int i4 = b + 21;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 != 0) {
                    jSONObject.put("displayName", getDisplayName());
                    int i5 = 24 / 0;
                } else {
                    jSONObject.put("displayName", getDisplayName());
                }
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 11;
                b = i6 % 128;
                int i7 = i6 % 2;
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            JSONArray jSONArray = new JSONArray();
            List list = this.zac;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 71;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (KeyEvent.getMaxKeyCode() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2624, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 481 - (Process.myPid() >> 22), 37 - Color.green(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $10 + 51;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i8 = $11 + 125;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39422), ExpandableListView.getPackedPositionChild(0L) + 482, 37 - (ViewConfiguration.getLongPressTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public String getDisplayName() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
            int iMyTid = 921 - (Process.myTid() >> 22);
            int i3 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            byte b2 = bArr[37];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[80], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, iMyTid, i3, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{39784, 12526, 52351, 39392, 13634, 49869, 40539, 11160, 50990, 40107, 10365, 50617, 37148, 11919, 64003, 38507, 9204, 65363, 38087, 8269, 64990, 35167}, Color.argb(0, 0, 0, 0) + 43913, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{39788, 8898, 59430, 46988, 32230, 15151, 49799, 35018, 22100, 7607, 56291, 24912, 10420, 63007, 48206}, Color.red(0) + 47527, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
            int i4 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            a(b3, (byte) (b3 | 52), bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, keyRepeatDelay, i4, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 9;
            b = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                int iMyPid = (Process.myPid() >> 22) + 921;
                int iAxisFromString = 27 - MotionEvent.axisFromString("");
                byte b4 = $$a[80];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b5, (byte) (b5 | 37), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iMyPid, iAxisFromString, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i7 = ~Process.myUid();
            int i8 = 53445738 + (((~((-1633457665) | i7)) | (-140621980)) * (-983)) + (((~(i7 | (-140621980))) | 136390811) * 983) + 1090513528;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{39784, 41986, 58791, 9556, 26354, 42905, 59187, 8420, 24640, 41460, 57995, 8816, 25588, 41803, 60667, 11659, 27951, 44757, 61031, 12047, 26809, 43048, 59861, 10623, 27152, 43952}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16229, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{39786, 63009, 16833, 54124, 11800, 47542, 2899, 26307, 61841, 17212, 57031, 10655, 47926, 5841, 24683, 62227, 20150, 55370}, Color.green(0) + 27997, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{39779, 3475, 46729, 24473, 49355, 27010, 4746, 48058, 11446, 54772, 32404, 59321, 35006, 12738, 56022, 17361}, View.resolveSize(0, 0) + 38651, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{39776, 2988, 47854, 10532, 55417, 18597, 65531, 28215, 7497, 36257, 15600, 41770, 21062, 49835, 29155, 57379}, Color.red(0) + 37057, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentbindingInflater1 + 61;
            b = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1090513528};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[35];
                Object[] objArr13 = new Object[1];
                d((byte) (b6 + 1), (byte) (-b6), b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) (-bArr3[35]);
                Object[] objArr14 = new Object[1];
                d(b7, (byte) (b7 - 1), bArr3[14], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31533 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int longPressTimeout = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b8 = $$a[80];
                    byte b9 = b8;
                    Object[] objArr16 = new Object[1];
                    a(b9, (byte) (b9 | 37), b8, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, threadPriority, longPressTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{39784, 12526, 52351, 39392, 13634, 49869, 40539, 11160, 50990, 40107, 10365, 50617, 37148, 11919, 64003, 38507, 9204, 65363, 38087, 8269, 64990, 35167}, 43913 - View.getDefaultSize(0, 0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{39788, 8898, 59430, 46988, 32230, 15151, 49799, 35018, 22100, 7607, 56291, 24912, 10420, 63007, 48206}, TextUtils.lastIndexOf("", '0', 0) + 47528, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                        int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[80];
                        Object[] objArr19 = new Object[1];
                        a(b10, (byte) (b10 | 52), bArr4[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iCombineMeasuredStates, jumpTapTimeout, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                        int iGreen = Color.green(0) + 921;
                        int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[37];
                        byte b12 = b11;
                        byte b13 = bArr5[80];
                        byte b14 = b11;
                        Object[] objArr20 = new Object[1];
                        a(b12, b13, b14, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, iGreen, minimumFlingVelocity, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                int i13 = TuitionPaymentFragmentbindingInflater1 + 61;
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 22;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i14 = TuitionPaymentFragmentbindingInflater1 + 15;
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i17 = ~((-758548123) | (~iIdentityHashCode));
        int i18 = i16 + ((276908033 | i17 | (~(758548122 | iIdentityHashCode))) * (-338)) + 879714285 + (((~(iIdentityHashCode | 1035456155)) | i17) * 338);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        int i21 = b + 19;
        TuitionPaymentFragmentbindingInflater1 = i21 % 128;
        if (i21 % 2 == 0) {
            return this.zag;
        }
        obj.hashCode();
        throw null;
    }

    public String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zaf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getFamilyName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 57;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zam;
        int i5 = i2 + 117;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getGivenName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 13;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zal;
        int i5 = i2 + 67;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public String getId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.zad;
        int i5 = i3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getIdToken() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 9;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zae;
        int i5 = i2 + 27;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public Uri getPhotoUrl() {
        int i = 2 % 2;
        int i2 = b + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Uri uri = this.zah;
        int i5 = i3 + 69;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return uri;
        }
        throw null;
    }

    public String getServerAuthCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zai;
        int i5 = i2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String zac() {
        int i = 2 % 2;
        int i2 = b + 71;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.zak;
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return str;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2987671335114912274L;
    }
}
