package kotlin.ranges;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u000f\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\u0002\u0010\t\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\f\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006\u001a\u0013\u0010\u000e\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\t\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\f\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\r\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0011\u001a\u00020\u0005*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0014\u001a\u0014\u0010\u0011\u001a\u00020\b*\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0016\u001a\u001b\u0010\u0011\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0011\u0010\u0019\u001a\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0011\u0010\u001a\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0011\u0010\u001b\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0001*\u00020\u0010H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0005*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\b*\u00020\u0015H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001f\u001a\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u0001*\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010 \u001a\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u0005*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010!\u001a\u001d\u0010\u001c\u001a\u0004\u0018\u00010\b*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\"\u001a\u001e\u0010$\u001a\u00020#*\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0004\b$\u0010%\u001a\u001e\u0010$\u001a\u00020#*\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0004\b$\u0010&\u001a\u001e\u0010$\u001a\u00020#*\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0004\b$\u0010'\u001a\"\u0010*\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00010(2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b*\u0010+\u001a\"\u0010,\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050(2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b,\u0010+\u001a\"\u0010.\u001a\u00020#*\b\u0012\u0004\u0012\u00020-0(2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b.\u0010+\u001a\"\u00100\u001a\u00020#*\b\u0012\u0004\u0012\u00020/0(2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b0\u0010+\u001a\"\u00102\u001a\u00020#*\b\u0012\u0004\u0012\u0002010(2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b2\u0010+\u001a\"\u0010*\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u0001032\u0006\u0010\u0018\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b*\u00104\u001a\"\u0010,\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u0005032\u0006\u0010\u0018\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b,\u00104\u001a\"\u0010.\u001a\u00020#*\b\u0012\u0004\u0012\u00020-032\u0006\u0010\u0018\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b.\u00104\u001a\u001c\u0010$\u001a\u00020#*\u00020\u00102\u0006\u0010\u0018\u001a\u00020)H\u0087\n¢\u0006\u0004\b$\u00105\u001a\u001c\u0010$\u001a\u00020#*\u00020\u00132\u0006\u0010\u0018\u001a\u00020)H\u0087\n¢\u0006\u0004\b$\u00106\u001a\"\u0010*\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00010(2\u0006\u0010\u0018\u001a\u00020/H\u0087\u0002¢\u0006\u0004\b*\u00107\u001a\"\u0010,\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050(2\u0006\u0010\u0018\u001a\u00020/H\u0087\u0002¢\u0006\u0004\b,\u00107\u001a\"\u00108\u001a\u00020#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0018\u001a\u00020/H\u0087\u0002¢\u0006\u0004\b8\u00107\u001a\"\u0010.\u001a\u00020#*\b\u0012\u0004\u0012\u00020-0(2\u0006\u0010\u0018\u001a\u00020/H\u0087\u0002¢\u0006\u0004\b.\u00107\u001a\"\u00102\u001a\u00020#*\b\u0012\u0004\u0012\u0002010(2\u0006\u0010\u0018\u001a\u00020/H\u0087\u0002¢\u0006\u0004\b2\u00107\u001a\"\u0010*\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00010(2\u0006\u0010\u0018\u001a\u000201H\u0087\u0002¢\u0006\u0004\b*\u00109\u001a\"\u0010,\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050(2\u0006\u0010\u0018\u001a\u000201H\u0087\u0002¢\u0006\u0004\b,\u00109\u001a\"\u00108\u001a\u00020#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0018\u001a\u000201H\u0087\u0002¢\u0006\u0004\b8\u00109\u001a\"\u0010.\u001a\u00020#*\b\u0012\u0004\u0012\u00020-0(2\u0006\u0010\u0018\u001a\u000201H\u0087\u0002¢\u0006\u0004\b.\u00109\u001a\"\u00100\u001a\u00020#*\b\u0012\u0004\u0012\u00020/0(2\u0006\u0010\u0018\u001a\u000201H\u0087\u0002¢\u0006\u0004\b0\u00109\u001a\"\u00100\u001a\u00020#*\b\u0012\u0004\u0012\u00020/032\u0006\u0010\u0018\u001a\u000201H\u0087\u0002¢\u0006\u0004\b0\u0010:\u001a\"\u0010,\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050(2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b,\u0010;\u001a\"\u00108\u001a\u00020#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b8\u0010;\u001a\"\u0010.\u001a\u00020#*\b\u0012\u0004\u0012\u00020-0(2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b.\u0010;\u001a\"\u00100\u001a\u00020#*\b\u0012\u0004\u0012\u00020/0(2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b0\u0010;\u001a\"\u00102\u001a\u00020#*\b\u0012\u0004\u0012\u0002010(2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b2\u0010;\u001a\"\u0010,\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u0005032\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b,\u0010<\u001a\"\u00108\u001a\u00020#*\b\u0012\u0004\u0012\u00020)032\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b8\u0010<\u001a\"\u0010.\u001a\u00020#*\b\u0012\u0004\u0012\u00020-032\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b.\u0010<\u001a\u001c\u0010$\u001a\u00020#*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b$\u0010=\u001a\"\u0010*\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00010(2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b*\u0010>\u001a\"\u00108\u001a\u00020#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b8\u0010>\u001a\"\u0010.\u001a\u00020#*\b\u0012\u0004\u0012\u00020-0(2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b.\u0010>\u001a\"\u00100\u001a\u00020#*\b\u0012\u0004\u0012\u00020/0(2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b0\u0010>\u001a\"\u00102\u001a\u00020#*\b\u0012\u0004\u0012\u0002010(2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b2\u0010>\u001a\"\u0010*\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u0001032\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b*\u0010?\u001a\"\u00108\u001a\u00020#*\b\u0012\u0004\u0012\u00020)032\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b8\u0010?\u001a\"\u0010.\u001a\u00020#*\b\u0012\u0004\u0012\u00020-032\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b.\u0010?\u001a\u001c\u0010$\u001a\u00020#*\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\n¢\u0006\u0004\b$\u0010@\u001a\"\u0010*\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00010(2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b*\u0010A\u001a\"\u0010,\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050(2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b,\u0010A\u001a\"\u00108\u001a\u00020#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b8\u0010A\u001a\"\u00100\u001a\u00020#*\b\u0012\u0004\u0012\u00020/0(2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b0\u0010A\u001a\"\u00102\u001a\u00020#*\b\u0012\u0004\u0012\u0002010(2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b2\u0010A\u001a\"\u0010*\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u0001032\u0006\u0010\u0018\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b*\u0010B\u001a\"\u0010,\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u0005032\u0006\u0010\u0018\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b,\u0010B\u001a\"\u00108\u001a\u00020#*\b\u0012\u0004\u0012\u00020)032\u0006\u0010\u0018\u001a\u00020-H\u0087\u0002¢\u0006\u0004\b8\u0010B\u001a\u001c\u0010$\u001a\u00020#*\u00020\u00102\u0006\u0010\u0018\u001a\u00020-H\u0087\n¢\u0006\u0004\b$\u0010C\u001a\u001c\u0010$\u001a\u00020#*\u00020\u00132\u0006\u0010\u0018\u001a\u00020-H\u0087\n¢\u0006\u0004\b$\u0010D\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0018\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bE\u0010F\u001a\u001c\u0010E\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0018\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bE\u0010G\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020)2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bE\u0010H\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020-2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bE\u0010I\u001a\u001c\u0010E\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\bE\u0010J\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bE\u0010K\u001a\u001c\u0010E\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bE\u0010L\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020)2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bE\u0010M\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020-2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bE\u0010N\u001a\u001c\u0010E\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bE\u0010O\u001a\u001c\u0010E\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bE\u0010P\u001a\u001c\u0010E\u001a\u00020\u0004*\u00020)2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bE\u0010Q\u001a\u001c\u0010E\u001a\u00020\u0004*\u00020-2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bE\u0010R\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0018\u001a\u00020-H\u0087\u0004¢\u0006\u0004\bE\u0010S\u001a\u001c\u0010E\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0018\u001a\u00020-H\u0087\u0004¢\u0006\u0004\bE\u0010T\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020)2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0004¢\u0006\u0004\bE\u0010U\u001a\u001c\u0010E\u001a\u00020\u0000*\u00020-2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0004¢\u0006\u0004\bE\u0010V\u001a\u0013\u0010W\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\bW\u0010X\u001a\u0013\u0010W\u001a\u00020\u0004*\u00020\u0004H\u0007¢\u0006\u0004\bW\u0010Y\u001a\u0013\u0010W\u001a\u00020\u0007*\u00020\u0007H\u0007¢\u0006\u0004\bW\u0010Z\u001a\u001c\u0010[\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b[\u0010\\\u001a\u001c\u0010[\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\b[\u0010]\u001a\u001c\u0010[\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b[\u0010^\u001a\u0015\u0010_\u001a\u0004\u0018\u00010)*\u00020\u0001H\u0000¢\u0006\u0004\b_\u0010`\u001a\u0015\u0010_\u001a\u0004\u0018\u00010)*\u00020\u0005H\u0000¢\u0006\u0004\b_\u0010a\u001a\u0015\u0010_\u001a\u0004\u0018\u00010)*\u00020-H\u0000¢\u0006\u0004\b_\u0010b\u001a\u0015\u0010_\u001a\u0004\u0018\u00010)*\u00020/H\u0000¢\u0006\u0004\b_\u0010c\u001a\u0015\u0010_\u001a\u0004\u0018\u00010)*\u000201H\u0000¢\u0006\u0004\b_\u0010d\u001a\u0015\u0010e\u001a\u0004\u0018\u00010\u0001*\u00020\u0005H\u0000¢\u0006\u0004\be\u0010f\u001a\u0015\u0010e\u001a\u0004\u0018\u00010\u0001*\u00020/H\u0000¢\u0006\u0004\be\u0010g\u001a\u0015\u0010e\u001a\u0004\u0018\u00010\u0001*\u000201H\u0000¢\u0006\u0004\be\u0010h\u001a\u0015\u0010i\u001a\u0004\u0018\u00010\u0005*\u00020/H\u0000¢\u0006\u0004\bi\u0010j\u001a\u0015\u0010i\u001a\u0004\u0018\u00010\u0005*\u000201H\u0000¢\u0006\u0004\bi\u0010k\u001a\u0015\u0010l\u001a\u0004\u0018\u00010-*\u00020\u0001H\u0000¢\u0006\u0004\bl\u0010m\u001a\u0015\u0010l\u001a\u0004\u0018\u00010-*\u00020\u0005H\u0000¢\u0006\u0004\bl\u0010n\u001a\u0015\u0010l\u001a\u0004\u0018\u00010-*\u00020/H\u0000¢\u0006\u0004\bl\u0010o\u001a\u0015\u0010l\u001a\u0004\u0018\u00010-*\u000201H\u0000¢\u0006\u0004\bl\u0010p\u001a\u001c\u0010q\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u0018\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bq\u0010r\u001a\u001c\u0010q\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0018\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bq\u0010s\u001a\u001c\u0010q\u001a\u00020\u0010*\u00020)2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bq\u0010t\u001a\u001c\u0010q\u001a\u00020\u0010*\u00020-2\u0006\u0010\u0018\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bq\u0010u\u001a\u001c\u0010q\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\bq\u0010v\u001a\u001c\u0010q\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bq\u0010w\u001a\u001c\u0010q\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bq\u0010x\u001a\u001c\u0010q\u001a\u00020\u0010*\u00020)2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bq\u0010y\u001a\u001c\u0010q\u001a\u00020\u0010*\u00020-2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bq\u0010z\u001a\u001c\u0010q\u001a\u00020\u0013*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bq\u0010{\u001a\u001c\u0010q\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bq\u0010|\u001a\u001c\u0010q\u001a\u00020\u0013*\u00020)2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bq\u0010}\u001a\u001c\u0010q\u001a\u00020\u0013*\u00020-2\u0006\u0010\u0018\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bq\u0010~\u001a\u001c\u0010q\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u0018\u001a\u00020-H\u0087\u0004¢\u0006\u0004\bq\u0010\u007f\u001a\u001d\u0010q\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0018\u001a\u00020-H\u0087\u0004¢\u0006\u0005\bq\u0010\u0080\u0001\u001a\u001d\u0010q\u001a\u00020\u0010*\u00020)2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0004¢\u0006\u0005\bq\u0010\u0081\u0001\u001a\u001d\u0010q\u001a\u00020\u0010*\u00020-2\u0006\u0010\u0018\u001a\u00020-H\u0087\u0004¢\u0006\u0005\bq\u0010\u0082\u0001\u001a0\u0010\u0085\u0001\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0084\u0001*\t\u0012\u0004\u0012\u00028\u00000\u0083\u0001*\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0007¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u001c\u0010\u0085\u0001\u001a\u00020)*\u00020)2\u0006\u0010\u0018\u001a\u00020)¢\u0006\u0006\b\u0085\u0001\u0010\u0087\u0001\u001a\u001c\u0010\u0085\u0001\u001a\u00020-*\u00020-2\u0006\u0010\u0018\u001a\u00020-¢\u0006\u0006\b\u0085\u0001\u0010\u0088\u0001\u001a\u001c\u0010\u0085\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0089\u0001\u001a\u001c\u0010\u0085\u0001\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0006\b\u0085\u0001\u0010\u008a\u0001\u001a\u001c\u0010\u0085\u0001\u001a\u000201*\u0002012\u0006\u0010\u0018\u001a\u000201¢\u0006\u0006\b\u0085\u0001\u0010\u008b\u0001\u001a\u001c\u0010\u0085\u0001\u001a\u00020/*\u00020/2\u0006\u0010\u0018\u001a\u00020/¢\u0006\u0006\b\u0085\u0001\u0010\u008c\u0001\u001a0\u0010\u008d\u0001\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0084\u0001*\t\u0012\u0004\u0012\u00028\u00000\u0083\u0001*\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0007¢\u0006\u0006\b\u008d\u0001\u0010\u0086\u0001\u001a\u001c\u0010\u008d\u0001\u001a\u00020)*\u00020)2\u0006\u0010\u0018\u001a\u00020)¢\u0006\u0006\b\u008d\u0001\u0010\u0087\u0001\u001a\u001c\u0010\u008d\u0001\u001a\u00020-*\u00020-2\u0006\u0010\u0018\u001a\u00020-¢\u0006\u0006\b\u008d\u0001\u0010\u0088\u0001\u001a\u001c\u0010\u008d\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u0089\u0001\u001a\u001c\u0010\u008d\u0001\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0006\b\u008d\u0001\u0010\u008a\u0001\u001a\u001c\u0010\u008d\u0001\u001a\u000201*\u0002012\u0006\u0010\u0018\u001a\u000201¢\u0006\u0006\b\u008d\u0001\u0010\u008b\u0001\u001a\u001c\u0010\u008d\u0001\u001a\u00020/*\u00020/2\u0006\u0010\u0018\u001a\u00020/¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001\u001a=\u0010\u008f\u0001\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0084\u0001*\t\u0012\u0004\u0012\u00028\u00000\u0083\u0001*\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00018\u00002\t\u0010\u008e\u0001\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a%\u0010\u008f\u0001\u001a\u00020)*\u00020)2\u0006\u0010\u0018\u001a\u00020)2\u0007\u0010\u008e\u0001\u001a\u00020)¢\u0006\u0006\b\u008f\u0001\u0010\u0091\u0001\u001a%\u0010\u008f\u0001\u001a\u00020-*\u00020-2\u0006\u0010\u0018\u001a\u00020-2\u0007\u0010\u008e\u0001\u001a\u00020-¢\u0006\u0006\b\u008f\u0001\u0010\u0092\u0001\u001a%\u0010\u008f\u0001\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0007\u0010\u008e\u0001\u001a\u00020\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0093\u0001\u001a%\u0010\u008f\u0001\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0007\u0010\u008e\u0001\u001a\u00020\u0005¢\u0006\u0006\b\u008f\u0001\u0010\u0094\u0001\u001a%\u0010\u008f\u0001\u001a\u000201*\u0002012\u0006\u0010\u0018\u001a\u0002012\u0007\u0010\u008e\u0001\u001a\u000201¢\u0006\u0006\b\u008f\u0001\u0010\u0095\u0001\u001a%\u0010\u008f\u0001\u001a\u00020/*\u00020/2\u0006\u0010\u0018\u001a\u00020/2\u0007\u0010\u008e\u0001\u001a\u00020/¢\u0006\u0006\b\u008f\u0001\u0010\u0096\u0001\u001a7\u0010\u008f\u0001\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0084\u0001*\t\u0012\u0004\u0012\u00028\u00000\u0083\u0001*\u00028\u00002\r\u0010\u0018\u001a\t\u0012\u0004\u0012\u00028\u00000\u0097\u0001H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0098\u0001\u001a6\u0010\u008f\u0001\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0084\u0001*\t\u0012\u0004\u0012\u00028\u00000\u0083\u0001*\u00028\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0099\u0001\u001a\"\u0010\u008f\u0001\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0006\b\u008f\u0001\u0010\u009a\u0001\u001a\"\u0010\u008f\u0001\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050(¢\u0006\u0006\b\u008f\u0001\u0010\u009b\u0001"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "first", "(Lkotlin/ranges/IntProgression;)I", "Lkotlin/ranges/LongProgression;", "", "(Lkotlin/ranges/LongProgression;)J", "Lkotlin/ranges/CharProgression;", "", "(Lkotlin/ranges/CharProgression;)C", "firstOrNull", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "last", "lastOrNull", "Lkotlin/ranges/IntRange;", "random", "(Lkotlin/ranges/IntRange;)I", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;)J", "Lkotlin/ranges/CharRange;", "(Lkotlin/ranges/CharRange;)C", "Lkotlin/random/Random;", "p0", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)J", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)C", "randomOrNull", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "", "contains", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "Lkotlin/ranges/ClosedRange;", "", "intRangeContains", "(Lkotlin/ranges/ClosedRange;B)Z", "longRangeContains", "", "shortRangeContains", "", "doubleRangeContains", "", "floatRangeContains", "Lkotlin/ranges/OpenEndRange;", "(Lkotlin/ranges/OpenEndRange;B)Z", "(Lkotlin/ranges/IntRange;B)Z", "(Lkotlin/ranges/LongRange;B)Z", "(Lkotlin/ranges/ClosedRange;D)Z", "byteRangeContains", "(Lkotlin/ranges/ClosedRange;F)Z", "(Lkotlin/ranges/OpenEndRange;F)Z", "(Lkotlin/ranges/ClosedRange;I)Z", "(Lkotlin/ranges/OpenEndRange;I)Z", "(Lkotlin/ranges/LongRange;I)Z", "(Lkotlin/ranges/ClosedRange;J)Z", "(Lkotlin/ranges/OpenEndRange;J)Z", "(Lkotlin/ranges/IntRange;J)Z", "(Lkotlin/ranges/ClosedRange;S)Z", "(Lkotlin/ranges/OpenEndRange;S)Z", "(Lkotlin/ranges/IntRange;S)Z", "(Lkotlin/ranges/LongRange;S)Z", "downTo", "(IB)Lkotlin/ranges/IntProgression;", "(JB)Lkotlin/ranges/LongProgression;", "(BB)Lkotlin/ranges/IntProgression;", "(SB)Lkotlin/ranges/IntProgression;", "(CC)Lkotlin/ranges/CharProgression;", "(II)Lkotlin/ranges/IntProgression;", "(JI)Lkotlin/ranges/LongProgression;", "(BI)Lkotlin/ranges/IntProgression;", "(SI)Lkotlin/ranges/IntProgression;", "(IJ)Lkotlin/ranges/LongProgression;", "(JJ)Lkotlin/ranges/LongProgression;", "(BJ)Lkotlin/ranges/LongProgression;", "(SJ)Lkotlin/ranges/LongProgression;", "(IS)Lkotlin/ranges/IntProgression;", "(JS)Lkotlin/ranges/LongProgression;", "(BS)Lkotlin/ranges/IntProgression;", "(SS)Lkotlin/ranges/IntProgression;", "reversed", "(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/LongProgression;)Lkotlin/ranges/LongProgression;", "(Lkotlin/ranges/CharProgression;)Lkotlin/ranges/CharProgression;", "step", "(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/LongProgression;J)Lkotlin/ranges/LongProgression;", "(Lkotlin/ranges/CharProgression;I)Lkotlin/ranges/CharProgression;", "toByteExactOrNull", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "toIntExactOrNull", "(J)Ljava/lang/Integer;", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "until", "(IB)Lkotlin/ranges/IntRange;", "(JB)Lkotlin/ranges/LongRange;", "(BB)Lkotlin/ranges/IntRange;", "(SB)Lkotlin/ranges/IntRange;", "(CC)Lkotlin/ranges/CharRange;", "(II)Lkotlin/ranges/IntRange;", "(JI)Lkotlin/ranges/LongRange;", "(BI)Lkotlin/ranges/IntRange;", "(SI)Lkotlin/ranges/IntRange;", "(IJ)Lkotlin/ranges/LongRange;", "(JJ)Lkotlin/ranges/LongRange;", "(BJ)Lkotlin/ranges/LongRange;", "(SJ)Lkotlin/ranges/LongRange;", "(IS)Lkotlin/ranges/IntRange;", "(JS)Lkotlin/ranges/LongRange;", "(BS)Lkotlin/ranges/IntRange;", "(SS)Lkotlin/ranges/IntRange;", "", ExifInterface.GPS_DIRECTION_TRUE, "coerceAtLeast", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(BB)B", "(SS)S", "(II)I", "(JJ)J", "(FF)F", "(DD)D", "coerceAtMost", "p1", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(BBB)B", "(SSS)S", "(III)I", "(JJJ)J", "(FFF)F", "(DDD)D", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "(ILkotlin/ranges/ClosedRange;)I", "(JLkotlin/ranges/ClosedRange;)J"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    public static final byte coerceAtLeast(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final byte coerceAtMost(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    public static final double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    public static final int first(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(intProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return intProgression.getFirst();
    }

    public static final long first(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(longProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return longProgression.getFirst();
    }

    public static final char first(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "");
        if (charProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(charProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return charProgression.getFirst();
    }

    public static final Integer firstOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    public static final Long firstOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    public static final Character firstOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    public static final int last(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(intProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return intProgression.getLast();
    }

    public static final long last(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(longProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return longProgression.getLast();
    }

    public static final char last(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "");
        if (charProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(charProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return charProgression.getLast();
    }

    public static final Integer lastOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    public static final Long lastOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    public static final Character lastOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    private static final int random(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return RangesKt.random(intRange, Random.INSTANCE);
    }

    private static final long random(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "");
        return RangesKt.random(longRange, Random.INSTANCE);
    }

    private static final char random(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "");
        return RangesKt.random(charRange, Random.INSTANCE);
    }

    public static final int random(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public static final long random(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public static final char random(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final Integer randomOrNull(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return RangesKt.randomOrNull(intRange, Random.INSTANCE);
    }

    private static final Long randomOrNull(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "");
        return RangesKt.randomOrNull(longRange, Random.INSTANCE);
    }

    private static final Character randomOrNull(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "");
        return RangesKt.randomOrNull(charRange, Random.INSTANCE);
    }

    public static final Integer randomOrNull(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    public static final Long randomOrNull(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    public static final Character randomOrNull(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    private static final boolean contains(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return num != null && intRange.contains(num.intValue());
    }

    private static final boolean contains(LongRange longRange, Long l) {
        Intrinsics.checkNotNullParameter(longRange, "");
        return l != null && longRange.contains(l.longValue());
    }

    private static final boolean contains(CharRange charRange, Character ch) {
        Intrinsics.checkNotNullParameter(charRange, "");
        return ch != null && charRange.contains(ch.charValue());
    }

    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, byte b) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Integer.valueOf(b));
    }

    public static final boolean longRangeContains(ClosedRange<Long> closedRange, byte b) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Long.valueOf(b));
    }

    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, byte b) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Short.valueOf(b));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Double.valueOf(b));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Float.valueOf(b));
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, byte b) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(Integer.valueOf(b));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, byte b) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(Long.valueOf(b));
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, byte b) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(Short.valueOf(b));
    }

    private static final boolean contains(IntRange intRange, byte b) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return RangesKt.intRangeContains((ClosedRange<Integer>) intRange, b);
    }

    private static final boolean contains(LongRange longRange, byte b) {
        Intrinsics.checkNotNullParameter(longRange, "");
        return RangesKt.longRangeContains((ClosedRange<Long>) longRange, b);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Long longExactOrNull = RangesKt.toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean floatRangeContains(ClosedRange<Float> closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Float.valueOf((float) d));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Long longExactOrNull = RangesKt.toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean doubleRangeContains(ClosedRange<Double> closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Double.valueOf(f));
    }

    public static final boolean doubleRangeContains(OpenEndRange<Double> openEndRange, float f) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(Double.valueOf(f));
    }

    public static final boolean longRangeContains(ClosedRange<Long> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Long.valueOf(i));
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Double.valueOf(i));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Float.valueOf(i));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(Long.valueOf(i));
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    private static final boolean contains(LongRange longRange, int i) {
        Intrinsics.checkNotNullParameter(longRange, "");
        return RangesKt.longRangeContains((ClosedRange<Long>) longRange, i);
    }

    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Double.valueOf(j));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Float.valueOf(j));
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, long j) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, long j) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, long j) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    private static final boolean contains(IntRange intRange, long j) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return RangesKt.intRangeContains((ClosedRange<Integer>) intRange, j);
    }

    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Integer.valueOf(s));
    }

    public static final boolean longRangeContains(ClosedRange<Long> closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Long.valueOf(s));
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Double.valueOf(s));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return closedRange.contains(Float.valueOf(s));
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, short s) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(Integer.valueOf(s));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, short s) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        return openEndRange.contains(Long.valueOf(s));
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, short s) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    private static final boolean contains(IntRange intRange, short s) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return RangesKt.intRangeContains((ClosedRange<Integer>) intRange, s);
    }

    private static final boolean contains(LongRange longRange, short s) {
        Intrinsics.checkNotNullParameter(longRange, "");
        return RangesKt.longRangeContains((ClosedRange<Long>) longRange, s);
    }

    public static final IntProgression downTo(int i, byte b) {
        return IntProgression.INSTANCE.fromClosedRange(i, b, -1);
    }

    public static final LongProgression downTo(long j, byte b) {
        return LongProgression.INSTANCE.fromClosedRange(j, b, -1L);
    }

    public static final IntProgression downTo(byte b, byte b2) {
        return IntProgression.INSTANCE.fromClosedRange(b, b2, -1);
    }

    public static final IntProgression downTo(short s, byte b) {
        return IntProgression.INSTANCE.fromClosedRange(s, b, -1);
    }

    public static final CharProgression downTo(char c, char c2) {
        return CharProgression.INSTANCE.fromClosedRange(c, c2, -1);
    }

    public static final IntProgression downTo(int i, int i2) {
        return IntProgression.INSTANCE.fromClosedRange(i, i2, -1);
    }

    public static final LongProgression downTo(long j, int i) {
        return LongProgression.INSTANCE.fromClosedRange(j, i, -1L);
    }

    public static final IntProgression downTo(byte b, int i) {
        return IntProgression.INSTANCE.fromClosedRange(b, i, -1);
    }

    public static final IntProgression downTo(short s, int i) {
        return IntProgression.INSTANCE.fromClosedRange(s, i, -1);
    }

    public static final LongProgression downTo(int i, long j) {
        return LongProgression.INSTANCE.fromClosedRange(i, j, -1L);
    }

    public static final LongProgression downTo(long j, long j2) {
        return LongProgression.INSTANCE.fromClosedRange(j, j2, -1L);
    }

    public static final LongProgression downTo(byte b, long j) {
        return LongProgression.INSTANCE.fromClosedRange(b, j, -1L);
    }

    public static final LongProgression downTo(short s, long j) {
        return LongProgression.INSTANCE.fromClosedRange(s, j, -1L);
    }

    public static final IntProgression downTo(int i, short s) {
        return IntProgression.INSTANCE.fromClosedRange(i, s, -1);
    }

    public static final LongProgression downTo(long j, short s) {
        return LongProgression.INSTANCE.fromClosedRange(j, s, -1L);
    }

    public static final IntProgression downTo(byte b, short s) {
        return IntProgression.INSTANCE.fromClosedRange(b, s, -1);
    }

    public static final IntProgression downTo(short s, short s2) {
        return IntProgression.INSTANCE.fromClosedRange(s, s2, -1);
    }

    public static final IntProgression reversed(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        return IntProgression.INSTANCE.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    public static final LongProgression reversed(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "");
        return LongProgression.INSTANCE.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    public static final CharProgression reversed(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "");
        return CharProgression.INSTANCE.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    public static final IntProgression step(IntProgression intProgression, int i) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        IntProgression.Companion companion = IntProgression.INSTANCE;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final LongProgression step(LongProgression longProgression, long j) {
        Intrinsics.checkNotNullParameter(longProgression, "");
        RangesKt.checkStepIsPositive(j > 0, Long.valueOf(j));
        LongProgression.Companion companion = LongProgression.INSTANCE;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.fromClosedRange(first, last, j);
    }

    public static final CharProgression step(CharProgression charProgression, int i) {
        Intrinsics.checkNotNullParameter(charProgression, "");
        RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        CharProgression.Companion companion = CharProgression.INSTANCE;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final Byte toByteExactOrNull(int i) {
        if (-128 > i || i >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i);
    }

    public static final Byte toByteExactOrNull(long j) {
        if (-128 > j || j >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j);
    }

    public static final Byte toByteExactOrNull(short s) {
        if (-128 > s || s >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s);
    }

    public static final Byte toByteExactOrNull(double d) {
        if (-128.0d > d || d > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d);
    }

    public static final Byte toByteExactOrNull(float f) {
        if (-128.0f > f || f > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f);
    }

    public static final Integer toIntExactOrNull(long j) {
        if (SieveCacheKt.NodeMetaAndPreviousMask > j || j >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j);
    }

    public static final Integer toIntExactOrNull(double d) {
        if (-2.147483648E9d > d || d > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    public static final Integer toIntExactOrNull(float f) {
        if (-2.1474836E9f > f || f > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    public static final Long toLongExactOrNull(double d) {
        if (-9.223372036854776E18d > d || d > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    public static final Long toLongExactOrNull(float f) {
        if (-9.223372E18f > f || f > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    public static final Short toShortExactOrNull(int i) {
        if (-32768 > i || i >= 32768) {
            return null;
        }
        return Short.valueOf((short) i);
    }

    public static final Short toShortExactOrNull(long j) {
        if (-32768 > j || j >= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) {
            return null;
        }
        return Short.valueOf((short) j);
    }

    public static final Short toShortExactOrNull(double d) {
        if (-32768.0d > d || d > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d);
    }

    public static final Short toShortExactOrNull(float f) {
        if (-32768.0f > f || f > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f);
    }

    public static final IntRange until(int i, byte b) {
        return new IntRange(i, b - 1);
    }

    public static final LongRange until(long j, byte b) {
        return new LongRange(j, ((long) b) - 1);
    }

    public static final IntRange until(byte b, byte b2) {
        return new IntRange(b, b2 - 1);
    }

    public static final IntRange until(short s, byte b) {
        return new IntRange(s, b - 1);
    }

    public static final CharRange until(char c, char c2) {
        return Intrinsics.compare((int) c2, 0) <= 0 ? CharRange.INSTANCE.getEMPTY() : new CharRange(c, (char) (c2 - 1));
    }

    public static final IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(i, i2 - 1);
    }

    public static final LongRange until(long j, int i) {
        return new LongRange(j, ((long) i) - 1);
    }

    public static final IntRange until(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(b, i - 1);
    }

    public static final IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(s, i - 1);
    }

    public static final LongRange until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(i, j - 1);
    }

    public static final LongRange until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(j, j2 - 1);
    }

    public static final LongRange until(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(b, j - 1);
    }

    public static final LongRange until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(s, j - 1);
    }

    public static final IntRange until(int i, short s) {
        return new IntRange(i, s - 1);
    }

    public static final LongRange until(long j, short s) {
        return new LongRange(j, ((long) s) - 1);
    }

    public static final IntRange until(byte b, short s) {
        return new IntRange(b, s - 1);
    }

    public static final IntRange until(short s, short s2) {
        return new IntRange(s, s2 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T t, T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t, T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004f A[RETURN] */
    public static final <T extends Comparable<? super T>> T coerceIn(T t, T t2, T t3) {
        Intrinsics.checkNotNullParameter(t, "");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) > 0) {
                StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
                sb.append(t3);
                sb.append(" is less than minimum ");
                sb.append(t2);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString());
            }
            if (t.compareTo(t2) >= 0) {
                if (t.compareTo(t3) > 0) {
                    return t3;
                }
                return t;
            }
            return t2;
        }
        if (t2 == null || t.compareTo(t2) >= 0) {
            if (t3 == null || t.compareTo(t3) <= 0) {
                return t;
            }
            return t3;
        }
        return t2;
    }

    public static final byte coerceIn(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            if (b < b2) {
                return b2;
            }
            return b > b3 ? b3 : b;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((int) b3);
        sb.append(" is less than minimum ");
        sb.append((int) b2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 <= s3) {
            if (s < s2) {
                return s2;
            }
            return s > s3 ? s3 : s;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((int) s3);
        sb.append(" is less than minimum ");
        sb.append((int) s2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(i3);
        sb.append(" is less than minimum ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(j3);
        sb.append(" is less than minimum ");
        sb.append(j2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(f3);
        sb.append(" is less than minimum ");
        sb.append(f2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(d3);
        sb.append(" is less than minimum ");
        sb.append(d2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t, ClosedFloatingPointRange<T> closedFloatingPointRange) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(closedFloatingPointRange, "");
        if (closedFloatingPointRange.isEmpty()) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: ");
            sb.append(closedFloatingPointRange);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (!closedFloatingPointRange.lessThanOrEquals(t, closedFloatingPointRange.getStart()) || closedFloatingPointRange.lessThanOrEquals(closedFloatingPointRange.getStart(), t)) {
            return (!closedFloatingPointRange.lessThanOrEquals(closedFloatingPointRange.getEndInclusive(), t) || closedFloatingPointRange.lessThanOrEquals(t, closedFloatingPointRange.getEndInclusive())) ? t : closedFloatingPointRange.getEndInclusive();
        }
        return closedFloatingPointRange.getStart();
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t, ClosedRange<T> closedRange) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof ClosedFloatingPointRange) {
            return (T) RangesKt.coerceIn((Comparable) t, (ClosedFloatingPointRange) closedRange);
        }
        if (closedRange.isEmpty()) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: ");
            sb.append(closedRange);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (t.compareTo(closedRange.getStart()) < 0) {
            return (T) closedRange.getStart();
        }
        return t.compareTo(closedRange.getEndInclusive()) > 0 ? (T) closedRange.getEndInclusive() : t;
    }

    public static final int coerceIn(int i, ClosedRange<Integer> closedRange) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.coerceIn(Integer.valueOf(i), (ClosedFloatingPointRange<Integer>) closedRange)).intValue();
        }
        if (closedRange.isEmpty()) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: ");
            sb.append(closedRange);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (i < ((Number) closedRange.getStart()).intValue()) {
            return ((Number) closedRange.getStart()).intValue();
        }
        return i > ((Number) closedRange.getEndInclusive()).intValue() ? ((Number) closedRange.getEndInclusive()).intValue() : i;
    }

    public static final long coerceIn(long j, ClosedRange<Long> closedRange) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.coerceIn(Long.valueOf(j), (ClosedFloatingPointRange<Long>) closedRange)).longValue();
        }
        if (!closedRange.isEmpty()) {
            if (j < ((Number) closedRange.getStart()).longValue()) {
                return ((Number) closedRange.getStart()).longValue();
            }
            return j > ((Number) closedRange.getEndInclusive()).longValue() ? ((Number) closedRange.getEndInclusive()).longValue() : j;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedRange);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
}
