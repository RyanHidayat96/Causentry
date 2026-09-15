package com.google.firebase.dynamiclinks;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\n\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000fH\u0087\u0002¢\u0006\u0004\b\r\u0010\u0010\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\f*\u00020\u000fH\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u000fH\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0019\u001a,\u0010\u001c\u001a\u00020\u001b*\u00020\u001a2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010 \u001a\u00020\u001a*\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!\u001a,\u0010#\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b#\u0010\u0007\u001aD\u0010#\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b#\u0010&\u001a4\u0010(\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b(\u0010\n\u001a,\u0010*\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b*\u0010\u0007\u001a,\u0010,\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b,\u0010\u0007\u001a2\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0-*\u00020\u001a2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b.\u0010/\u001a:\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0-*\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00112\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b.\u00100\u001a,\u00102\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b2\u0010\u0007\"\u0015\u0010 \u001a\u00020\u001a*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b3\u00104"}, d2 = {"Lcom/google/firebase/dynamiclinks/DynamicLink$Builder;", "Lkotlin/Function1;", "Lcom/google/firebase/dynamiclinks/DynamicLink$AndroidParameters$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p0", "androidParameters", "(Lcom/google/firebase/dynamiclinks/DynamicLink$Builder;Lkotlin/jvm/functions/Function1;)V", "", "p1", "(Lcom/google/firebase/dynamiclinks/DynamicLink$Builder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/firebase/dynamiclinks/PendingDynamicLinkData;", "Landroid/net/Uri;", "component1", "(Lcom/google/firebase/dynamiclinks/PendingDynamicLinkData;)Landroid/net/Uri;", "Lcom/google/firebase/dynamiclinks/ShortDynamicLink;", "(Lcom/google/firebase/dynamiclinks/ShortDynamicLink;)Landroid/net/Uri;", "", "component2", "(Lcom/google/firebase/dynamiclinks/PendingDynamicLinkData;)I", "", "component3", "(Lcom/google/firebase/dynamiclinks/PendingDynamicLinkData;)J", "", "Lcom/google/firebase/dynamiclinks/ShortDynamicLink$Warning;", "(Lcom/google/firebase/dynamiclinks/ShortDynamicLink;)Ljava/util/List;", "Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;", "Lcom/google/firebase/dynamiclinks/DynamicLink;", DynamicLink.Builder.KEY_DYNAMIC_LINK, "(Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;Lkotlin/jvm/functions/Function1;)Lcom/google/firebase/dynamiclinks/DynamicLink;", "Lcom/google/firebase/Firebase;", "Lcom/google/firebase/FirebaseApp;", "dynamicLinks", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;", "Lcom/google/firebase/dynamiclinks/DynamicLink$GoogleAnalyticsParameters$Builder;", "googleAnalyticsParameters", "p2", "p3", "(Lcom/google/firebase/dynamiclinks/DynamicLink$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/firebase/dynamiclinks/DynamicLink$IosParameters$Builder;", "iosParameters", "Lcom/google/firebase/dynamiclinks/DynamicLink$ItunesConnectAnalyticsParameters$Builder;", "itunesConnectAnalyticsParameters", "Lcom/google/firebase/dynamiclinks/DynamicLink$NavigationInfoParameters$Builder;", "navigationInfoParameters", "Lcom/google/android/gms/tasks/Task;", "shortLinkAsync", "(Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/tasks/Task;", "(Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;ILkotlin/jvm/functions/Function1;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/dynamiclinks/DynamicLink$SocialMetaTagParameters$Builder;", "socialMetaTagParameters", "getDynamicLinks", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FirebaseDynamicLinksKt {
    @Deprecated
    public static final FirebaseDynamicLinks getDynamicLinks(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "");
        FirebaseDynamicLinks firebaseDynamicLinks = FirebaseDynamicLinks.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseDynamicLinks, "");
        return firebaseDynamicLinks;
    }

    @Deprecated
    public static final FirebaseDynamicLinks dynamicLinks(Firebase firebase, FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebase, "");
        Intrinsics.checkNotNullParameter(firebaseApp, "");
        FirebaseDynamicLinks firebaseDynamicLinks = FirebaseDynamicLinks.getInstance(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(firebaseDynamicLinks, "");
        return firebaseDynamicLinks;
    }

    @Deprecated
    public static final void androidParameters(DynamicLink.Builder builder, Function1<? super DynamicLink.AndroidParameters.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.AndroidParameters.Builder builder2 = new DynamicLink.AndroidParameters.Builder();
        function1.invoke(builder2);
        builder.setAndroidParameters(builder2.build());
    }

    @Deprecated
    public static final void androidParameters(DynamicLink.Builder builder, String str, Function1<? super DynamicLink.AndroidParameters.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.AndroidParameters.Builder builder2 = new DynamicLink.AndroidParameters.Builder(str);
        function1.invoke(builder2);
        builder.setAndroidParameters(builder2.build());
    }

    @Deprecated
    public static final void iosParameters(DynamicLink.Builder builder, String str, Function1<? super DynamicLink.IosParameters.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.IosParameters.Builder builder2 = new DynamicLink.IosParameters.Builder(str);
        function1.invoke(builder2);
        builder.setIosParameters(builder2.build());
    }

    @Deprecated
    public static final void googleAnalyticsParameters(DynamicLink.Builder builder, Function1<? super DynamicLink.GoogleAnalyticsParameters.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.GoogleAnalyticsParameters.Builder builder2 = new DynamicLink.GoogleAnalyticsParameters.Builder();
        function1.invoke(builder2);
        builder.setGoogleAnalyticsParameters(builder2.build());
    }

    @Deprecated
    public static final void googleAnalyticsParameters(DynamicLink.Builder builder, String str, String str2, String str3, Function1<? super DynamicLink.GoogleAnalyticsParameters.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.GoogleAnalyticsParameters.Builder builder2 = new DynamicLink.GoogleAnalyticsParameters.Builder(str, str2, str3);
        function1.invoke(builder2);
        builder.setGoogleAnalyticsParameters(builder2.build());
    }

    @Deprecated
    public static final void itunesConnectAnalyticsParameters(DynamicLink.Builder builder, Function1<? super DynamicLink.ItunesConnectAnalyticsParameters.Builder, Unit> function1) throws Throwable {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.ItunesConnectAnalyticsParameters.Builder builder2 = new DynamicLink.ItunesConnectAnalyticsParameters.Builder();
        function1.invoke(builder2);
        builder.setItunesConnectAnalyticsParameters(builder2.build());
    }

    @Deprecated
    public static final void socialMetaTagParameters(DynamicLink.Builder builder, Function1<? super DynamicLink.SocialMetaTagParameters.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.SocialMetaTagParameters.Builder builder2 = new DynamicLink.SocialMetaTagParameters.Builder();
        function1.invoke(builder2);
        builder.setSocialMetaTagParameters(builder2.build());
    }

    @Deprecated
    public static final void navigationInfoParameters(DynamicLink.Builder builder, Function1<? super DynamicLink.NavigationInfoParameters.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.NavigationInfoParameters.Builder builder2 = new DynamicLink.NavigationInfoParameters.Builder();
        function1.invoke(builder2);
        builder.setNavigationInfoParameters(builder2.build());
    }

    @Deprecated
    public static final DynamicLink dynamicLink(FirebaseDynamicLinks firebaseDynamicLinks, Function1<? super DynamicLink.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(firebaseDynamicLinks, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.Builder builderCreateDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkNotNullExpressionValue(builderCreateDynamicLink, "");
        function1.invoke(builderCreateDynamicLink);
        DynamicLink dynamicLinkBuildDynamicLink = builderCreateDynamicLink.buildDynamicLink();
        Intrinsics.checkNotNullExpressionValue(dynamicLinkBuildDynamicLink, "");
        return dynamicLinkBuildDynamicLink;
    }

    @Deprecated
    public static final Task<ShortDynamicLink> shortLinkAsync(FirebaseDynamicLinks firebaseDynamicLinks, Function1<? super DynamicLink.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(firebaseDynamicLinks, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.Builder builderCreateDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkNotNullExpressionValue(builderCreateDynamicLink, "");
        function1.invoke(builderCreateDynamicLink);
        Task<ShortDynamicLink> taskBuildShortDynamicLink = builderCreateDynamicLink.buildShortDynamicLink();
        Intrinsics.checkNotNullExpressionValue(taskBuildShortDynamicLink, "");
        return taskBuildShortDynamicLink;
    }

    @Deprecated
    public static final Task<ShortDynamicLink> shortLinkAsync(FirebaseDynamicLinks firebaseDynamicLinks, int i, Function1<? super DynamicLink.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(firebaseDynamicLinks, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DynamicLink.Builder builderCreateDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkNotNullExpressionValue(builderCreateDynamicLink, "");
        function1.invoke(builderCreateDynamicLink);
        Task<ShortDynamicLink> taskBuildShortDynamicLink = builderCreateDynamicLink.buildShortDynamicLink(i);
        Intrinsics.checkNotNullExpressionValue(taskBuildShortDynamicLink, "");
        return taskBuildShortDynamicLink;
    }

    @Deprecated
    public static final Uri component1(ShortDynamicLink shortDynamicLink) {
        Intrinsics.checkNotNullParameter(shortDynamicLink, "");
        return shortDynamicLink.getShortLink();
    }

    @Deprecated
    public static final Uri component2(ShortDynamicLink shortDynamicLink) {
        Intrinsics.checkNotNullParameter(shortDynamicLink, "");
        return shortDynamicLink.getPreviewLink();
    }

    @Deprecated
    public static final List<ShortDynamicLink.Warning> component3(ShortDynamicLink shortDynamicLink) {
        Intrinsics.checkNotNullParameter(shortDynamicLink, "");
        List warnings = shortDynamicLink.getWarnings();
        Intrinsics.checkNotNullExpressionValue(warnings, "");
        return warnings;
    }

    @Deprecated
    public static final Uri component1(PendingDynamicLinkData pendingDynamicLinkData) {
        Intrinsics.checkNotNullParameter(pendingDynamicLinkData, "");
        return pendingDynamicLinkData.getLink();
    }

    @Deprecated
    public static final int component2(PendingDynamicLinkData pendingDynamicLinkData) {
        Intrinsics.checkNotNullParameter(pendingDynamicLinkData, "");
        return pendingDynamicLinkData.getMinimumAppVersion();
    }

    @Deprecated
    public static final long component3(PendingDynamicLinkData pendingDynamicLinkData) {
        Intrinsics.checkNotNullParameter(pendingDynamicLinkData, "");
        return pendingDynamicLinkData.getClickTimestamp();
    }
}
