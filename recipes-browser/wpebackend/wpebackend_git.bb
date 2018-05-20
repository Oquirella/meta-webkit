require wpebackend.inc

DEFAULT_PRERENCE = "-1"
PV = "0.1~git"

# This version of WPEBackend is not selected by default on this layer,
# as the released versions is preferred.
# To select it, add on your local.conf conf file the line below:
#
# PREFERRED_VERSION_wpebackend = "0.1~git%"

SRCREV = "3ca651d393566ec2f2801e447b67d3f71377e363"
SRC_URI = "git://github.com/WebPlatformForEmbedded/WPEBackend.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
