import React, {
  PureComponent,
} from 'react'

import {
  View,
  ActivityIndicator,
} from 'react-native'

import PropTypes from 'prop-types'

import { SMALL } from './size'

export default class Spin extends PureComponent {

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

    return (
      <ActivityIndicator
        size={size}
        color={color}
      />
    )

  }

}
