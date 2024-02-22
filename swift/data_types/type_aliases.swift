/*
Type aliases define an alternative name for an existing type.
*/

typealias AudioSample = UInt16
/*
Once you define a type alias, you can use the
 alias anywhere you might use the original name:
*/
var maxAmplitudeFound = AudioSample.min
// maxAmplitudeFound is now 0