@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package assert.assert

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface `T$68` {
    var message: String?
        get() = definedExternally
        set(value) = definedExternally
    var actual: Any?
        get() = definedExternally
        set(value) = definedExternally
    var expected: Any?
        get() = definedExternally
        set(value) = definedExternally
    var operator: String?
        get() = definedExternally
        set(value) = definedExternally
    var stackStartFn: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
}

typealias AssertionError = Error