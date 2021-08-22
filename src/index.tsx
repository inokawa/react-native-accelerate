import { NativeModules } from 'react-native';

type ZxingScannerType = {
  multiply(a: number, b: number): Promise<number>;
};

const { ZxingScanner } = NativeModules;

export default ZxingScanner as ZxingScannerType;
