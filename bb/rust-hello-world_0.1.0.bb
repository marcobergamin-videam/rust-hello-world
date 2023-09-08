# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get rust-hello-world could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/rust-hello-world/0.1.0"
SRC_URI += "git://git@github.com/marcobergamin-videam/rust-hello-world.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "95ef98fc60661e6a50e559ca3ba169c877020a0e"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+95ef98fc60"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/random/0.14.0 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "A simple Hello World program written in Rust"
HOMEPAGE = ""
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include rust-hello-world-${PV}.inc
include rust-hello-world.inc
