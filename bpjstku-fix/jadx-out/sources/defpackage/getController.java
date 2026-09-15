package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getController extends fromMediaSession {
    private final Matrix INotificationSideChannel;
    private final RectF INotificationSideChannelDefault;
    private binderDied<Integer, Integer> INotificationSideChannelStub;
    private final Paint INotificationSideChannelStubProxy;
    private binderDied<Float, Float> IconCompatParcelizer;
    private binderDied<Float, Float> MediaBrowserCompat;
    private binderDied<Integer, Integer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private binderDied<Integer, Integer> f925a;
    private final LongSparseArray<String> asBinder;
    private binderDied<Integer, Integer> asInterface;
    private final Map<getMaxVolume, List<skipToQueueItem>> cancel;
    private final previous cancelAll;
    private binderDied<Float, Float> connect;
    private binderDied<Float, Float> disconnect;
    private binderDied<Float, Float> getExtras;
    private final StringBuilder getInterfaceDescriptor;
    private final prepare notify;
    private final Paint onTransact;
    private binderDied<Float, Float> read;
    private final MediaControllerCompatMediaControllerImplApi21 write;

    getController(prepare prepareVar, Layer layer) throws Throwable {
        super(prepareVar, layer);
        this.getInterfaceDescriptor = new StringBuilder(2);
        this.INotificationSideChannelDefault = new RectF();
        this.INotificationSideChannel = new Matrix();
        this.onTransact = new Paint() { // from class: getController.5
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.INotificationSideChannelStubProxy = new Paint() { // from class: getController.1
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.cancel = new HashMap();
        this.asBinder = new LongSparseArray<>();
        this.notify = prepareVar;
        this.cancelAll = layer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        MediaControllerCompatMediaControllerImplApi21 mediaControllerCompatMediaControllerImplApi21 = new MediaControllerCompatMediaControllerImplApi21(layer.RemoteActionCompatParcelizer.b);
        this.write = mediaControllerCompatMediaControllerImplApi21;
        mediaControllerCompatMediaControllerImplApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(mediaControllerCompatMediaControllerImplApi21);
        MediaControllerCompatApi21CallbackProxy mediaControllerCompatApi21CallbackProxy = layer.INotificationSideChannelDefault;
        if (mediaControllerCompatApi21CallbackProxy != null && mediaControllerCompatApi21CallbackProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            binderDied<Integer, Integer> binderdiedTuitionPaymentFragmentbindingInflater1 = mediaControllerCompatApi21CallbackProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            this.f925a = binderdiedTuitionPaymentFragmentbindingInflater1;
            binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Integer, Integer> binderdied = this.f925a;
            if (binderdied != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied);
            }
        }
        if (mediaControllerCompatApi21CallbackProxy != null && mediaControllerCompatApi21CallbackProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            binderDied<Integer, Integer> binderdiedTuitionPaymentFragmentbindingInflater2 = mediaControllerCompatApi21CallbackProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
            this.RemoteActionCompatParcelizer = binderdiedTuitionPaymentFragmentbindingInflater2;
            binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Integer, Integer> binderdied2 = this.RemoteActionCompatParcelizer;
            if (binderdied2 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
            }
        }
        if (mediaControllerCompatApi21CallbackProxy != null && mediaControllerCompatApi21CallbackProxy.b != null) {
            binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater3 = mediaControllerCompatApi21CallbackProxy.b.TuitionPaymentFragmentbindingInflater1();
            this.connect = binderdiedTuitionPaymentFragmentbindingInflater3;
            binderdiedTuitionPaymentFragmentbindingInflater3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Float, Float> binderdied3 = this.connect;
            if (binderdied3 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied3);
            }
        }
        if (mediaControllerCompatApi21CallbackProxy == null || mediaControllerCompatApi21CallbackProxy.TuitionPaymentFragmentbindingInflater1 == null) {
            return;
        }
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater4 = mediaControllerCompatApi21CallbackProxy.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        this.disconnect = binderdiedTuitionPaymentFragmentbindingInflater4;
        binderdiedTuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderDied<Float, Float> binderdied4 = this.disconnect;
        if (binderdied4 != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied4);
        }
    }

    @Override // defpackage.fromMediaSession, defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width(), this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.fromMediaSession
    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Canvas canvas, Matrix matrix, int i) throws Throwable {
        Typeface typefaceCreate;
        float fFloatValue;
        List list;
        String string;
        float fFloatValue2;
        int i2;
        float fFloatValue3;
        int i3;
        String str;
        List<skipToQueueItem> list2;
        float fFloatValue4;
        String str2;
        canvas.save();
        prepare prepareVar = this.notify;
        if (prepareVar.RemoteActionCompatParcelizer != null || prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.size() <= 0) {
            canvas.setMatrix(matrix);
        }
        DocumentData documentDataAsInterface = this.write.asInterface();
        MediaControllerCompatMediaControllerImplApi21ExtraCallback mediaControllerCompatMediaControllerImplApi21ExtraCallback = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(documentDataAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (mediaControllerCompatMediaControllerImplApi21ExtraCallback == null) {
            canvas.restore();
            return;
        }
        binderDied<Integer, Integer> binderdied = this.asInterface;
        if (binderdied != null) {
            this.onTransact.setColor(binderdied.asInterface().intValue());
        } else {
            binderDied<Integer, Integer> binderdied2 = this.f925a;
            if (binderdied2 != null) {
                this.onTransact.setColor(binderdied2.asInterface().intValue());
            } else {
                this.onTransact.setColor(documentDataAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        binderDied<Integer, Integer> binderdied3 = this.INotificationSideChannelStub;
        if (binderdied3 != null) {
            this.INotificationSideChannelStubProxy.setColor(binderdied3.asInterface().intValue());
        } else {
            binderDied<Integer, Integer> binderdied4 = this.RemoteActionCompatParcelizer;
            if (binderdied4 != null) {
                this.INotificationSideChannelStubProxy.setColor(binderdied4.asInterface().intValue());
            } else {
                this.INotificationSideChannelStubProxy.setColor(documentDataAsInterface.d);
            }
        }
        int iIntValue = ((this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == null ? 100 : this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().asInterface().intValue()) * 255) / 100;
        this.onTransact.setAlpha(iIntValue);
        this.INotificationSideChannelStubProxy.setAlpha(iIntValue);
        binderDied<Float, Float> binderdied5 = this.MediaBrowserCompat;
        if (binderdied5 != null) {
            this.INotificationSideChannelStubProxy.setStrokeWidth(binderdied5.asInterface().floatValue());
        } else {
            binderDied<Float, Float> binderdied6 = this.connect;
            if (binderdied6 != null) {
                this.INotificationSideChannelStubProxy.setStrokeWidth(binderdied6.asInterface().floatValue());
            } else {
                this.INotificationSideChannelStubProxy.setStrokeWidth(documentDataAsInterface.asInterface * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2() * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(matrix));
            }
        }
        prepare prepareVar2 = this.notify;
        if (prepareVar2.RemoteActionCompatParcelizer == null && prepareVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.size() > 0) {
            binderDied<Float, Float> binderdied7 = this.read;
            if (binderdied7 != null) {
                fFloatValue3 = binderdied7.asInterface().floatValue();
            } else {
                fFloatValue3 = documentDataAsInterface.asBinder;
            }
            float f = fFloatValue3 / 100.0f;
            float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(matrix);
            String str3 = documentDataAsInterface.g;
            float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = documentDataAsInterface.TuitionPaymentFragmentbindingInflater1 * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            List listAsList = Arrays.asList(str3.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size = listAsList.size();
            int i4 = 0;
            while (i4 < size) {
                String str4 = (String) listAsList.get(i4);
                float fTuitionPaymentFragmentspecialinlinedviewModeldefault4 = 0.0f;
                int i5 = 0;
                while (i5 < str4.length()) {
                    getMaxVolume getmaxvolume = this.cancelAll.b.get((((str4.charAt(i5) * 31) + mediaControllerCompatMediaControllerImplApi21ExtraCallback.b.hashCode()) * 31) + mediaControllerCompatMediaControllerImplApi21ExtraCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode());
                    if (getmaxvolume != null) {
                        str2 = str4;
                        fTuitionPaymentFragmentspecialinlinedviewModeldefault4 = (float) (((double) fTuitionPaymentFragmentspecialinlinedviewModeldefault4) + (getmaxvolume.TuitionPaymentFragmentbindingInflater1 * ((double) f) * ((double) onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) * ((double) fTuitionPaymentFragmentspecialinlinedviewModeldefault2)));
                    } else {
                        str2 = str4;
                    }
                    i5++;
                    i4 = i4;
                    str4 = str2;
                }
                int i6 = i4;
                String str5 = str4;
                canvas.save();
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(documentDataAsInterface.b, canvas, fTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                canvas.translate(0.0f, (i6 * fTuitionPaymentFragmentspecialinlinedviewModeldefault3) - (((size - 1) * fTuitionPaymentFragmentspecialinlinedviewModeldefault3) / 2.0f));
                int i7 = 0;
                while (i7 < str5.length()) {
                    String str6 = str5;
                    getMaxVolume getmaxvolume2 = this.cancelAll.b.get((((str6.charAt(i7) * 31) + mediaControllerCompatMediaControllerImplApi21ExtraCallback.b.hashCode()) * 31) + mediaControllerCompatMediaControllerImplApi21ExtraCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode());
                    if (getmaxvolume2 != null) {
                        if (this.cancel.containsKey(getmaxvolume2)) {
                            list2 = this.cancel.get(getmaxvolume2);
                            i3 = size;
                        } else {
                            List<MediaSessionCompat> list3 = getmaxvolume2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int size2 = list3.size();
                            ArrayList arrayList = new ArrayList(size2);
                            int i8 = 0;
                            while (i8 < size2) {
                                arrayList.add(new skipToQueueItem(this.notify, this, list3.get(i8)));
                                i8++;
                                list3 = list3;
                                size = size;
                                size2 = size2;
                            }
                            i3 = size;
                            this.cancel.put(getmaxvolume2, arrayList);
                            list2 = arrayList;
                        }
                        int i9 = 0;
                        while (i9 < list2.size()) {
                            Path pathTuitionPaymentFragmentspecialinlinedviewModeldefault2 = list2.get(i9).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            pathTuitionPaymentFragmentspecialinlinedviewModeldefault2.computeBounds(this.INotificationSideChannelDefault, false);
                            this.INotificationSideChannel.set(matrix);
                            List<skipToQueueItem> list4 = list2;
                            String str7 = str6;
                            this.INotificationSideChannel.preTranslate(0.0f, (-documentDataAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2) * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                            this.INotificationSideChannel.preScale(f, f);
                            pathTuitionPaymentFragmentspecialinlinedviewModeldefault2.transform(this.INotificationSideChannel);
                            if (documentDataAsInterface.f362a) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1(pathTuitionPaymentFragmentspecialinlinedviewModeldefault2, this.onTransact, canvas);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1(pathTuitionPaymentFragmentspecialinlinedviewModeldefault2, this.INotificationSideChannelStubProxy, canvas);
                            } else {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1(pathTuitionPaymentFragmentspecialinlinedviewModeldefault2, this.INotificationSideChannelStubProxy, canvas);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1(pathTuitionPaymentFragmentspecialinlinedviewModeldefault2, this.onTransact, canvas);
                            }
                            i9++;
                            list2 = list4;
                            str6 = str7;
                        }
                        str = str6;
                        float f2 = (float) getmaxvolume2.TuitionPaymentFragmentbindingInflater1;
                        float fTuitionPaymentFragmentspecialinlinedviewModeldefault5 = onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        float f3 = documentDataAsInterface.cancel / 10.0f;
                        binderDied<Float, Float> binderdied8 = this.getExtras;
                        if (binderdied8 != null) {
                            fFloatValue4 = binderdied8.asInterface().floatValue();
                        } else {
                            binderDied<Float, Float> binderdied9 = this.disconnect;
                            if (binderdied9 != null) {
                                fFloatValue4 = binderdied9.asInterface().floatValue();
                            }
                            canvas.translate((f2 * f * fTuitionPaymentFragmentspecialinlinedviewModeldefault5 * fTuitionPaymentFragmentspecialinlinedviewModeldefault2) + (f3 * fTuitionPaymentFragmentspecialinlinedviewModeldefault2), 0.0f);
                        }
                        f3 += fFloatValue4;
                        canvas.translate((f2 * f * fTuitionPaymentFragmentspecialinlinedviewModeldefault5 * fTuitionPaymentFragmentspecialinlinedviewModeldefault2) + (f3 * fTuitionPaymentFragmentspecialinlinedviewModeldefault2), 0.0f);
                    } else {
                        listAsList = listAsList;
                        i3 = size;
                        str = str6;
                    }
                    i7++;
                    listAsList = listAsList;
                    size = i3;
                    str5 = str;
                }
                canvas.restore();
                i4 = i6 + 1;
            }
        } else {
            float fTuitionPaymentFragmentspecialinlinedviewModeldefault6 = onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(matrix);
            prepare prepareVar3 = this.notify;
            String str8 = mediaControllerCompatMediaControllerImplApi21ExtraCallback.b;
            String str9 = mediaControllerCompatMediaControllerImplApi21ExtraCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            MediaControllerCompatMediaControllerImplApi24 mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2 = prepareVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                MediaControllerCompatTransportControls<String> mediaControllerCompatTransportControls = mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.g;
                mediaControllerCompatTransportControls.TuitionPaymentFragmentbindingInflater1 = str8;
                mediaControllerCompatTransportControls.b = str9;
                typefaceCreate = mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.get(mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.g);
                if (typefaceCreate == null) {
                    typefaceCreate = mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.get(str8);
                    if (typefaceCreate == null) {
                        playFromMediaId playfrommediaid = mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        playFromMediaId playfrommediaid2 = mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        StringBuilder sb = new StringBuilder("fonts/");
                        sb.append(str8);
                        sb.append(mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        typefaceCreate = Typeface.createFromAsset(mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, sb.toString());
                        mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.put(str8, typefaceCreate);
                    }
                    boolean zContains = str9.contains("Italic");
                    boolean zContains2 = str9.contains("Bold");
                    if (zContains && zContains2) {
                        i2 = 3;
                    } else if (zContains) {
                        i2 = 2;
                    } else {
                        i2 = zContains2 ? 1 : 0;
                    }
                    if (typefaceCreate.getStyle() != i2) {
                        typefaceCreate = Typeface.create(typefaceCreate, i2);
                    }
                    mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.put(mediaControllerCompatMediaControllerImplApi24TuitionPaymentFragmentspecialinlinedviewModeldefault2.g, typefaceCreate);
                }
            } else {
                typefaceCreate = null;
            }
            if (typefaceCreate != null) {
                String str10 = documentDataAsInterface.g;
                setCaptioningEnabled setcaptioningenabled = this.notify.RemoteActionCompatParcelizer;
                if (setcaptioningenabled != null) {
                    if (setcaptioningenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && setcaptioningenabled.TuitionPaymentFragmentbindingInflater1.containsKey(str10)) {
                        str10 = setcaptioningenabled.TuitionPaymentFragmentbindingInflater1.get(str10);
                    } else if (setcaptioningenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        setcaptioningenabled.TuitionPaymentFragmentbindingInflater1.put(str10, str10);
                    }
                }
                this.onTransact.setTypeface(typefaceCreate);
                binderDied<Float, Float> binderdied10 = this.read;
                if (binderdied10 != null) {
                    fFloatValue = binderdied10.asInterface().floatValue();
                } else {
                    fFloatValue = documentDataAsInterface.asBinder;
                }
                this.onTransact.setTextSize(fFloatValue * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                this.INotificationSideChannelStubProxy.setTypeface(this.onTransact.getTypeface());
                this.INotificationSideChannelStubProxy.setTextSize(this.onTransact.getTextSize());
                float fTuitionPaymentFragmentspecialinlinedviewModeldefault7 = documentDataAsInterface.TuitionPaymentFragmentbindingInflater1 * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                List listAsList2 = Arrays.asList(str10.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = listAsList2.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    String str11 = (String) listAsList2.get(i10);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(documentDataAsInterface.b, canvas, this.INotificationSideChannelStubProxy.measureText(str11));
                    canvas.translate(0.0f, (i10 * fTuitionPaymentFragmentspecialinlinedviewModeldefault7) - (((size3 - 1) * fTuitionPaymentFragmentspecialinlinedviewModeldefault7) / 2.0f));
                    int length = 0;
                    while (length < str11.length()) {
                        int iCodePointAt = str11.codePointAt(length);
                        int iCharCount = Character.charCount(iCodePointAt) + length;
                        while (iCharCount < str11.length()) {
                            int iCodePointAt2 = str11.codePointAt(iCharCount);
                            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 19) {
                                break;
                            }
                            iCharCount += Character.charCount(iCodePointAt2);
                            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                        }
                        long j = iCodePointAt;
                        if (this.asBinder.containsKey(j)) {
                            string = this.asBinder.get(j);
                            list = listAsList2;
                        } else {
                            this.getInterfaceDescriptor.setLength(0);
                            int iCharCount2 = length;
                            while (iCharCount2 < iCharCount) {
                                int iCodePointAt3 = str11.codePointAt(iCharCount2);
                                this.getInterfaceDescriptor.appendCodePoint(iCodePointAt3);
                                iCharCount2 += Character.charCount(iCodePointAt3);
                                listAsList2 = listAsList2;
                            }
                            list = listAsList2;
                            string = this.getInterfaceDescriptor.toString();
                            this.asBinder.put(j, string);
                        }
                        length += string.length();
                        if (documentDataAsInterface.f362a) {
                            TuitionPaymentFragmentbindingInflater1(string, this.onTransact, canvas);
                            TuitionPaymentFragmentbindingInflater1(string, this.INotificationSideChannelStubProxy, canvas);
                        } else {
                            TuitionPaymentFragmentbindingInflater1(string, this.INotificationSideChannelStubProxy, canvas);
                            TuitionPaymentFragmentbindingInflater1(string, this.onTransact, canvas);
                        }
                        float fMeasureText = this.onTransact.measureText(string, 0, 1);
                        float f4 = documentDataAsInterface.cancel / 10.0f;
                        binderDied<Float, Float> binderdied11 = this.getExtras;
                        if (binderdied11 != null) {
                            fFloatValue2 = binderdied11.asInterface().floatValue();
                        } else {
                            binderDied<Float, Float> binderdied12 = this.disconnect;
                            if (binderdied12 != null) {
                                fFloatValue2 = binderdied12.asInterface().floatValue();
                            }
                            canvas.translate(fMeasureText + (f4 * fTuitionPaymentFragmentspecialinlinedviewModeldefault6), 0.0f);
                            listAsList2 = list;
                        }
                        f4 += fFloatValue2;
                        canvas.translate(fMeasureText + (f4 * fTuitionPaymentFragmentspecialinlinedviewModeldefault6), 0.0f);
                        listAsList2 = list;
                    }
                    canvas.setMatrix(matrix);
                }
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: getController$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = AnonymousClass4.TuitionPaymentFragmentspecialinlinedviewModeldefault2[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else {
            if (i != 3) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private static void TuitionPaymentFragmentbindingInflater1(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    @Override // defpackage.fromMediaSession, defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        super.b(t, mediaSessionCompatCallbackCallbackHandler);
        if (t == registerCallbackListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            binderDied<Integer, Integer> binderdied = this.asInterface;
            if (binderdied != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.asInterface = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.asInterface = processpendingcallbackslocked;
            processpendingcallbackslocked.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Integer, Integer> binderdied2 = this.asInterface;
            if (binderdied2 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
                return;
            }
            return;
        }
        if (t == registerCallbackListener.INotificationSideChannelDefault) {
            binderDied<Integer, Integer> binderdied3 = this.INotificationSideChannelStub;
            if (binderdied3 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied3);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.INotificationSideChannelStub = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked2 = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.INotificationSideChannelStub = processpendingcallbackslocked2;
            processpendingcallbackslocked2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Integer, Integer> binderdied4 = this.INotificationSideChannelStub;
            if (binderdied4 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied4);
                return;
            }
            return;
        }
        if (t == registerCallbackListener.INotificationSideChannelStub) {
            binderDied<Float, Float> binderdied5 = this.MediaBrowserCompat;
            if (binderdied5 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied5);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.MediaBrowserCompat = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked3 = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.MediaBrowserCompat = processpendingcallbackslocked3;
            processpendingcallbackslocked3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Float, Float> binderdied6 = this.MediaBrowserCompat;
            if (binderdied6 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied6);
                return;
            }
            return;
        }
        if (t == registerCallbackListener.INotificationSideChannelStubProxy) {
            binderDied<Float, Float> binderdied7 = this.getExtras;
            if (binderdied7 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied7);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.getExtras = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked4 = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.getExtras = processpendingcallbackslocked4;
            processpendingcallbackslocked4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Float, Float> binderdied8 = this.getExtras;
            if (binderdied8 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied8);
                return;
            }
            return;
        }
        if (t == registerCallbackListener.RemoteActionCompatParcelizer) {
            binderDied<Float, Float> binderdied9 = this.read;
            if (binderdied9 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied9);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.read = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked5 = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.read = processpendingcallbackslocked5;
            processpendingcallbackslocked5.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Float, Float> binderdied10 = this.read;
            if (binderdied10 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied10);
            }
        }
    }
}
