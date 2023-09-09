package app.revanced.patches.marktplaats.ad.fingerprints

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint

object JsonAdsFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, _ ->
        methodDef.definingClass.endsWith("JsonAds;") && methodDef.name == "setAd"
    }
)