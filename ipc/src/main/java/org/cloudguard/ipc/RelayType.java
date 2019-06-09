package org.cloudguard.ipc;

public enum RelayType {
    CRYPTOTick,

    UIResultForConnect,
    UIResultForDisconnect,
    CRYPTOConnectWithKeys,
    CRYPTODisconnectFromServer,

    UIResultForAddContact,
    UIResultForRemoveContact,
    UIResultForRenameContact,

    UIResultForContact,
    
    UIResultForSpeechSend,
    UISpeechUpdate,
    UISpeechNextIdentifier,


    CRYPTOAddContact,
    CRYPTORemoveContact,
    CRYPTORenameContact,
    
    CRYPTOGetAllContact,
    CRYPTOGetContactArchive,

    CRYPTOSend,

    CRYPTOFakeFill,
    CRYPTOFakeReceive,

    UIPublicKey,
    UISecurity,
    
}
