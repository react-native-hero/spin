import React, {
  PureComponent,
} from 'react'

import {
  requireNativeComponent,
} from 'react-native'

import PropTypes from 'prop-types'

import { SMALL } from './size'

class Spin extends PureComponent {

  static propTypes = {
    size: PropTypes.string.isRequired,
    color: PropTypes.string.isRequired,
  }

  static defaultProps = {
    size: SMALL,
    color: '#999',
  }

  render() {

    let {
      size,
      color,
    } = this.props

    // 尺寸和 ios 保持一致
    let width = 20
    let height = 20
    if (size !== SMALL) {
      width = height = 36
    }

    return (
      <RNTSpin
        color={color}
        style={{
          width,
          height,
          // ios 是居中的表现
          alignSelf: 'center',
        }}
      />
    )

  }

}

const RNTSpin = requireNativeComponent('RNTSpin', Spin)

export default Spin
