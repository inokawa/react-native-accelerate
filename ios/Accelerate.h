#import <React/RCTBridgeModule.h>
#import "example.h"

@interface Accelerate : NSObject <RCTBridgeModule>

@property (nonatomic, assign) BOOL setBridgeOnMainQueue;

@end
