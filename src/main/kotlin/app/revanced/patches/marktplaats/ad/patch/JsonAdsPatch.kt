package app.revanced.patches.hexeditor.ad.patch

import app.revanced.patcher.annotation.Description
import app.revanced.patcher.annotation.Name
import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.removeInstruction
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotations.Patch
import app.revanced.patches.marktplaats.ad.annotation.JsonAdsCompatibility
import app.revanced.patches.marktplaats.ad.fingerprints.JsonAdsFingerprint

@Patch
@Name("Disable ads")
@Description("Disables ads in Marktplaats.")
@JsonAdsCompatibility
class JsonAdsPatch : BytecodePatch(
    listOf(
        JsonAdsFingerprint
    )
) {
    override fun execute(context: BytecodeContext) {
        val method = JsonAdsFingerprint.result!!.mutableMethod
        
        method.removeInstruction(0) // remove iput-object to set ad
    }
}
