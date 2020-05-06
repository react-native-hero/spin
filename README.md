# @react-native-hero/spin

## Getting started

Install the library using either Yarn:

```
yarn add @react-native-hero/spin
```

or npm:

```
npm install --save @react-native-hero/spin
```

## Link

For android, the package will be linked automatically on build.

- React Native <= 0.59

run the following command to link the package:

```
$ react-native link @react-native-hero/spin
```

## Example

```js
import {
  SIZE,
  Spin,
} from '@react-native-hero/spin'

<Spin
  size={SIZE.SMALL}
  color="#999"
/>
```