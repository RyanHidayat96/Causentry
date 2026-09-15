package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import defpackage.CameraStateRegistryCameraRegistration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzue {
    private static final ImmutableSet zza = ImmutableSet.TuitionPaymentFragmentbindingInflater1("applet", "base", "embed", "math", "meta", "object", "svg", "template");
    private static final ImmutableSet zzb = ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("script");
    private static final ImmutableSet zzc = ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("style");
    private static final ImmutableSet zzd = ImmutableSet.TuitionPaymentFragmentbindingInflater1("area", "br", "col", "hr", "img", "input", DynamicLink.Builder.KEY_LINK, "param", "source", "track", "wbr");
    private static final ImmutableSet zzh;
    private static final ImmutableSet zzi;
    private final String zze;
    private final Map zzf = new LinkedHashMap();
    private final List zzg = new ArrayList();

    static {
        ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("input");
        ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("form");
        ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("script");
        ImmutableSet.b("button", "input");
        ImmutableSet.b("button", "input");
        zzh = ImmutableSet.b("a", "area");
        zzi = ImmutableSet.TuitionPaymentFragmentbindingInflater1("alternate", "author", "bookmark", "canonical", "cite", "help", "icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", FirebaseAnalytics.Event.SEARCH, "subresource");
        ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("form");
        ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("input");
        ImmutableSet.b("input", "textarea");
        ImmutableSet.TuitionPaymentFragmentbindingInflater1("audio", "img", "input", "source", "video");
        ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("iframe");
    }

    public zzue(String str) {
        if (!"a".matches("[a-z0-9-]+")) {
            throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
        }
        if (zza.contains("a")) {
            throw new IllegalArgumentException("Element \"a\" is not supported.");
        }
        this.zze = "a";
    }

    public final zzue zza(zzug zzugVar) {
        String str;
        ImmutableSet immutableSet = zzh;
        String str2 = this.zze;
        if (!immutableSet.contains(str2) && !str2.equals(DynamicLink.Builder.KEY_LINK)) {
            throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(String.valueOf(immutableSet))));
        }
        if (!str2.equals(DynamicLink.Builder.KEY_LINK) || (str = (String) this.zzf.get("rel")) == null || zzi.contains(str.toLowerCase(Locale.ENGLISH))) {
            this.zzf.put("href", zzaqp.zzb(zzugVar.zza(), 65533));
            return this;
        }
        StringBuilder sb = new StringBuilder(str.length() + 113);
        sb.append("SafeUrl values for the href attribute are not allowed on <link rel=");
        sb.append(str);
        sb.append(">. Did you intend to use a TrustedResourceUrl?");
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzue zzb(String str) {
        Iterator it = Arrays.asList(zzuf.zza(str)).iterator();
        ImmutableSet immutableSet = zzd;
        String str2 = this.zze;
        if (!(!immutableSet.contains(str2))) {
            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Element \"%s\" is a void element and so cannot have content.", str2));
        }
        if (!(!zzb.contains(str2))) {
            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Element \"%s\" requires SafeScript contents, not SafeHTML or text.", str2));
        }
        if (!(!zzc.contains(str2))) {
            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", str2));
        }
        while (it.hasNext()) {
            this.zzg.add(((zzud) it.next()).zza());
        }
        return this;
    }

    public final zzud zzc() {
        StringBuilder sb = new StringBuilder("<");
        String str = this.zze;
        sb.append(str);
        for (Map.Entry entry : this.zzf.entrySet()) {
            sb.append(" ");
            sb.append((String) entry.getKey());
            sb.append("=\"");
            sb.append(zzub.zza((String) entry.getValue()));
            sb.append("\"");
        }
        boolean zContains = zzd.contains(str);
        sb.append(">");
        if (!zContains) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            sb.append("</");
            sb.append(str);
            sb.append(">");
        }
        return new zzud(sb.toString());
    }
}
